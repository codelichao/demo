package com.lc.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lc.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author lc
 * @date 2020/12/27 15:23
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user where telephone = #{account} and password = #{password}")
    User login(Long account,String password);
}
