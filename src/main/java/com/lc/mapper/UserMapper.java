package com.lc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lc.entity.User;
import org.apache.ibatis.annotations.Select;


public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user where username=#{username}")
    User getByUsername(String username);
}
