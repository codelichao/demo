package com.lc.servcie.impl;



import com.lc.entity.User;
import com.lc.mapper.UserMapper;
import com.lc.servcie.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String username) {
        return userMapper.getByUsername(username);
    }

}
