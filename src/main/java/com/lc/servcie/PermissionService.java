package com.lc.servcie;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.entity.Permission;

import java.util.List;

public interface PermissionService extends IService<Permission> {


    List<String> getPermissionByUserId(Integer userId);
}
