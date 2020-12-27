package com.lc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author lc
 * @date 2020/12/27 15:09
 */

@Data
public class Record implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private int id;

    private String name;

    private int money;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime time;

    private String remark;









}
