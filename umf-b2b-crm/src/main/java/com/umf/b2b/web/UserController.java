package com.umf.b2b.web;

import com.umf.b2b.dto.User;
import com.umf.b2b.service.UserService;
import com.umf.b2b.util.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController implements UserService {

    @Autowired
    Producer producer;//注入消息生产者类

    /**
     * RequestMapping注解重写时会自动带过来，此处不再需要使用
     * @param userId
     * @return
     */
    @Override
    public String getUserName(String userId) {
        return "Hello consumer";
    }

    @Override
    public User getUser(String userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("lizhibin");
        user.setAge(18);
        try {
            sendMsgToMq();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    /**
     * 测试消息入MQ
     * @throws Exception
     */
    @RequestMapping(value = "/send-message", method = RequestMethod.GET)
    public void setMsgToMq() throws Exception{
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("funCode", "pickupNotify");
        map.put("mercustId", "15837886129");
        map.put("trade_time", "144538");
        map.put("charset", "GBK");
        map.put("merId","25018");
        map.put("amt_type","RMB");
        map.put("settle_date", "20180111");
        map.put("plat_trace", "1801020924141942");
        map.put("amount", "600000");
        map.put("trade_date", "20180111");
        map.put("service", "pickup_notify");
        map.put("rpid", "M25a386a56342123");
        map.put("goodsid", "P266003H");

        producer.sendMessage("F3.InputQueue", map, Long.valueOf("172800000"), true);

    }

    public void sendMsgToMq() throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("funCode", "pickupNotify");
        map.put("mercustId", "15837886129");
        map.put("trade_time", "144538");
        map.put("charset", "GBK");
        map.put("merId","25018");
        map.put("amt_type","RMB");
        map.put("settle_date", "20180111");
        map.put("plat_trace", "1801020924141942");
        map.put("amount", "600000");
        map.put("trade_date", "20180111");
        map.put("service", "pickup_notify");
        map.put("rpid", "M25a386a56342123");
        map.put("goodsid", "P266003H");

        producer.sendMessage("F3.InputQueue", map, Long.valueOf("172800000"), true);

    }
}
