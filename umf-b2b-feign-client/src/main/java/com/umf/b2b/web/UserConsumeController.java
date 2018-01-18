package com.umf.b2b.web;

import com.umf.b2b.dto.User;
import com.umf.b2b.service.UserFeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConsumeController {

    @Autowired
    UserFeignClientService userService;

    @RequestMapping("/getUserName/{userId}")
    public String getUserName(@PathVariable(value="userId") String userId) {
        return userService.getUserName(userId);
    }

    @RequestMapping("/getUser/{userId}")
    public User getUser(@PathVariable(value="userId") String userId) {
        return userService.getUser(userId);
    }
}
