package com.lc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class RolePermission {

    private final long serialVersionUID=1L;

    @TableId(value = "id",type = IdType.AUTO)
    private int id;

    private int roleId;

    private int permissionId;

}
