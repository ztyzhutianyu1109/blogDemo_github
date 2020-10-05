package com.ty.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (TabDiary)实体类
 *
 * @author makejava
 * @since 2020-09-17 10:36:05
 *
 * 日记实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diary implements Serializable {
    private static final long serialVersionUID = -17395254040377257L;
    /**
     * 日记主键
     */
    private Integer diaryId;
    /**
     * 日记日期
     */
    private Date diaryDate;
    /**
     * 日记日容
     */
    private String diaryContent;
    /**
     * 日记图片
     */
    private String diaryImg;

}