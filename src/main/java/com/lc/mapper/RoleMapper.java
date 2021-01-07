package com.lc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lc.entity.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {


    @Select("SELECT rolename from role a \n" +
            "LEFT JOIN user_role b on a.id = b.roleId \n" +
            "LEFT JOIN user c on c.id\t= b.userId where c.username=#{userId}")
    List<String> getRoleByUserId(Integer userId);


}
