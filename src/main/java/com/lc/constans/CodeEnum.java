package com.lc.constans;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum CodeEnum implements IEnum<String> {


    //文件编码：1 UTF-8, 2 GBK, 3 UNICODE
    UTF8("UTF-8"),

    GBK("GBK"),

    UNICODE("UNICODE");


    private String comment;

    CodeEnum(String comment) {

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
