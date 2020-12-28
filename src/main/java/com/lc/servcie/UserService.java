package com.lc.servcie;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.entity.User;

/**
 * @author lc
 * @date 2020/12/27 15:24
 */
public interface UserService extends IService<User> {

    User login(Long account,String password);
}
