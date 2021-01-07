package com.lc.constans;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum FileTypeEnum implements IEnum<String> {

    txt("txt"),

    xls("xls"),

    csv("csv");


    private String comment;

    FileTypeEnum(String comment) {

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
