package com.lc.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserRole implements Serializable {

    private final long serialVersionUID=1L;

    @TableId(value = "id",type = IdType.AUTO)
    private int id;

    private int userId;

    private int roleId;


}
