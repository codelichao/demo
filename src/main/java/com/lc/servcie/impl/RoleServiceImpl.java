package com.lc.servcie.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.entity.Role;
import com.lc.mapper.RoleMapper;

import com.lc.servcie.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<String> getRoleByUserId(Integer userId){
        return roleMapper.getRoleByUserId(userId);
    }

}
