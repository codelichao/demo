package com.lc.constans;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Auther: 张前峰
 * @Date: 2019/6/27 10:47
 * @Description:
 */
public enum JobTypeEnum implements IEnum<String> {
    /**
     * 轮廓分析
     */
    PROFILING("轮廓分析"),
    /**
     * 数据质量
     */
    DATA_QUALITY("数据质量"),

    CRAWL("元数据爬取"),

    DB_SYNC("数据库同步"),
    TABLE_SYNC("数据库表任务"),
    FILE_DBSYNC("文件同步数据库"),

    DATA_SYNC("数据同步");



    private String comment;

    JobTypeEnum(String comment) {

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
