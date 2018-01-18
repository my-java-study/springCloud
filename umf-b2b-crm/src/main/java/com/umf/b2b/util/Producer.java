package com.umf.b2b.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import java.io.Serializable;
import java.util.HashMap;

/**
 *  消息生产者，兼容现有activeMQ，Notify.Front3
 */
@Component
public class Producer {

    private final static Logger logger = LoggerFactory.getLogger(Producer.class);

    @Autowired // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    private JmsTemplate jmsTemplate;

    @Autowired
    private B2BMessageConvertor b2BMessageConvertor;

    /**
     * @param queuename  队列名
     * @param msg        消息
     * @param timeToLive 消息存活时间
     * @param persist    是否持久化
     * @throws JMSException
     */
    public void sendMessage(String queuename, HashMap<String, Object> msg, Long timeToLive, boolean persist) throws JMSException {
        logger.info(String.format("准备发消息到mq队列[%s]，发送的数据为：[%s]", queuename, msg));
        jmsTemplate.setTimeToLive(timeToLive);//消息存活时间
        jmsTemplate.setDeliveryMode(persist ? DeliveryMode.PERSISTENT : DeliveryMode.NON_PERSISTENT);
        jmsTemplate.convertAndSend(queuename, (Serializable) msg);
    }
}
