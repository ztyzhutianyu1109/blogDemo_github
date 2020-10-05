package com.ty.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (TabMessage)实体类
 *
 * @author makejava
 * @since 2020-09-17 16:45:54
 *
 *  留言实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {
    private static final long serialVersionUID = -33989290709124225L;
    /**
     * 留言主键
     */
    private Integer messageId;
    /**
     * 留言人名字
     */
    private String messageName;
    /**
     * 留言时间
     */
    private Date messageDate;
    /**
     * 留言内容
     */
    private String messageContent;
    /**
     * 留言人头像
     */
    private String messageImg;

}