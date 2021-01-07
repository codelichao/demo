package com.lc.constans;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Auther: 张前峰
 * @Date: 2019/6/27 10:47
 * @Description:
 */
public enum ExecuteStateEnum implements IEnum<String> {

    /**
     * 运行中
     */
    RUNNING("运行中"),
    /**
     * 错误
     */
    ERROR("错误"),
    //成功
    SUCCESS("成功");


    private String comment;

    ExecuteStateEnum(String comment) {

        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String getValue() {
        return this.name();
    }
}
