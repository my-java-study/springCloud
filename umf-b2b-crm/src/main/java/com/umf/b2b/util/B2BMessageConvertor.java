package com.umf.b2b.util;

import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.io.Serializable;

/**
 * 消息转换器
 * 将入MQ消息序列化
 */
@Component
public class B2BMessageConvertor implements MessageConverter {

    /**
     * 入MQ消息在此序列化
     * @param object
     * @param session
     * @return
     * @throws JMSException
     * @throws MessageConversionException
     */
    @Override
    public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
        return session.createObjectMessage((Serializable) object);
    }

    @Override
    public Object fromMessage(Message message) throws JMSException, MessageConversionException {
        return null;
    }
}
