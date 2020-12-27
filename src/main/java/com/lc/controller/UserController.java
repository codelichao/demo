package com.lc.controller;

import com.lc.entity.User;
import com.lc.servcie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lc
 * @date 2020/12/27 15:35
 */
@Controller("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public void add(User user){
        userService.save(user);
    }
}
