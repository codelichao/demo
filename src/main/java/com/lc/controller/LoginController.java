package com.lc.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lc.entity.User;
import com.lc.servcie.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author lc
 * @date 2020/12/27 17:34
 */
@RestController
@Api(tags = "注册登录接口")
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @ApiOperation(value="注册")
    @PostMapping("/register")
    public Boolean register(@RequestBody User user){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("telephone",user.getTelephone());
        if(userService.getOne(queryWrapper)!=null){
            return false;
        }
        user.setRole("nolmal");
        return userService.save(user);
    }

    @ApiOperation(value="登录")
    @GetMapping("/login")
    public User login(@Param("telephone") Long telephone,@Param("password") String password){
        User user=userService.login(telephone, password);
        if(user==null){
            return null;
        }else{
            return user;
        }
    }
}
