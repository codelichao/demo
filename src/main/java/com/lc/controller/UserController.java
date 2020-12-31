package com.lc.controller;

import com.lc.entity.User;
import com.lc.servcie.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lc
 * @date 2020/12/27 15:35
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户接口")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value="保存用户")
    @PostMapping("/save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @ApiOperation(value="删除用户")
    @DeleteMapping("/remove")
    public void remove(Long id) {
        userService.removeById(id);
    }

    @ApiOperation(value="修改用户")
    @PostMapping("/update")
    public void update(User user) {
        userService.updateById(user);
    }

    @ApiOperation(value="查询用户")
    @GetMapping("/selectAll")
    public List<User> selectAll(){
        return userService.list();
    }
}
