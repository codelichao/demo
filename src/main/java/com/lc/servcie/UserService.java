package com.lc.servcie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.entity.User;


public interface UserService extends IService<User> {

    User getByUsername(String username);
}
