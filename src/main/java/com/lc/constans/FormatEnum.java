package com.lc.constans;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum FormatEnum implements IEnum<String> {

    //压缩格式：1 zip、2 gzip、3 bzip2
    zip("zip"),

    gzip("gzip"),

    bzip2("bzip2");

    private String comment;

    FormatEnum(String comment) {

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
