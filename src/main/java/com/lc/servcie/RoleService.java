package com.lc.servcie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.entity.Role;

import java.util.List;

public interface RoleService extends IService<Role> {

    List<String> getRoleByUserId(Integer userId);

}
