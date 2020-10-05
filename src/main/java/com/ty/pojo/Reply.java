package com.ty.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (TabReply)实体类
 *
 * @author makejava
 * @since 2020-09-17 16:45:56
 *
 *  回复实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reply implements Serializable {
    private static final long serialVersionUID = 851132125209678580L;
    /**
     * 回复主键
     */
    private Integer replyId;
    /**
     * 回复人名字
     */
    private String replyName;
    /**
     * 回复时间
     */
    private Date replyDate;
    /**
     * 回复内容
     */
    private String replyContent;
    /**
     * 给谁回复,关联留言(message)表message_id
     */
    private Integer replyForId;
    /**
     * 被回复人名字
     */
    private String replyForName;
    /**
     * 回复人头像
     */
    private String replyImg;
    /**
     * 被回复人头像
     */
    private String replyForImg;

}