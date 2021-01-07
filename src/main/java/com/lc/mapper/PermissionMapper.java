package com.lc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lc.entity.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionMapper extends BaseMapper<Permission> {

    @Select("SELECT * from permission a \n" +
            "LEFT JOIN role_permission b on a.id = b.permissionId\n" +
            "LEFT JOIN role c on c.id\t= b.roleId\n" +
            "LEFT JOIN user_role d on c.id=d.roleId\n" +
            "LEFT JOIN user e on e.id\t= d.userId where e.id=#{userId}")
    List<String> getPermissionByUserId(Integer userId);
}
