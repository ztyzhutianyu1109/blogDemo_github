package com.ty.service;

import com.ty.pojo.Diary;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/17 10:41
 */
public interface DiaryService {

    /**
     * 返回所有日记信息
     * @return
     */
    List<Diary> queryDiary();

    /**
     * 返回日期中包含的所有年份
     * @return
     */
    List<Integer> getYear();
}
