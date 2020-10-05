package com.ty.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TContents)实体类
 *
 * @author makejava
 * @since 2020-09-22 08:26:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contents implements Serializable {
    private static final long serialVersionUID = -18253472069246366L;
    /**
     * 文章的主键编号
     */
    private Object cid;
    /**
     * 内容标题
     */
    private String title;
    /**
     * 标题图片
     */
    private String titlepic;
    /**
     * 内容缩略名
     */
    private String slug;
    /**
     * 内容生成时的GMT unix时间戳
     */
    private Object created;
    /**
     * 内容更改时的GMT unix时间戳
     */
    private Object modified;
    /**
     * 内容文字
     */
    private String content;
    /**
     * 内容所属用户id
     */
    private Object authorid;
    /**
     * 内容类别
     */
    private String type;
    /**
     * 内容状态
     */
    private String status;
    /**
     * 标签列表
     */
    private String tags;
    /**
     * 分类列表
     */
    private String categories;
    /**
     * 点击次数
     */
    private Object hits;
    /**
     * 内容所属评论数
     */
    private Object commentsnum;
    /**
     * 是否允许评论
     */
    private Object allowcomment;
    /**
     * 是否允许ping
     */
    private Object allowping;
    /**
     * 允许出现在聚合中
     */
    private Object allowfeed;

}