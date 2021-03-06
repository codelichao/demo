package com.lc.servcie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.entity.User;
import com.lc.mapper.UserMapper;
import com.lc.servcie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByUsername(String username) {
        return userMapper.getByUsername(username);
    }
}
