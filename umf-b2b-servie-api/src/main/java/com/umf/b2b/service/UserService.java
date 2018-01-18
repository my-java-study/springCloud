package com.umf.b2b.service;

import com.umf.b2b.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/User")
public interface UserService {

    @RequestMapping(value = "/getUserName", method = RequestMethod.GET)
    String getUserName(@RequestParam("userId") String userId);

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    User getUser(@RequestParam("userId") String userId);
}
