package com.lc.servcie.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.entity.User;
import com.lc.mapper.UserMapper;
import com.lc.servcie.UserService;
import org.springframework.stereotype.Service;

/**
 * @author lc
 * @date 2020/12/27 15:24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
