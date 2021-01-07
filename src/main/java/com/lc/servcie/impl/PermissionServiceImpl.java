package com.lc.servcie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.entity.Permission;
import com.lc.mapper.PermissionMapper;

import com.lc.servcie.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper,Permission> implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;


    @Override
    public List<String> getPermissionByUserId(Integer userId) {
        return permissionMapper.getPermissionByUserId(userId);
    }
}
