package com.hms.manage.domain.article.entity;

import com.hms.manage.domain.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author Hms
 * @Date 2024/11/27 23:58
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class Article extends BaseEntity {

    /**
     *  文章分类
     */
    private Long categoryId;

    /**
     *  文章缩略图
     */
    private String articleCover;

    /**
     *  标题
     */
    private String articleTitle;

    /**
     *  文章摘要，如果该字段为空，默认取文章的前500个字符作为摘要
     */
    private String articleAbstract;

    /**
     *  内容
     */
    private String articleContent;

    /**
     *  是否置顶 0否 1是
     */
    private Integer isTop;

    /**
     *  是否推荐 0否 1是
     */
    private Integer isFeatured;

    /**
     *  状态值 1公开 2私密 3草稿
     */
    private Integer status;

    /**
     *  文章类型 1原创 2转载 3翻译
     */
    private Integer type;

    /**
     *  原文链接
     */
    private String originalUrl;
}
