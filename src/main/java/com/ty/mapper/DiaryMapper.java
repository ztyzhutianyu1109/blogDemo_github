package com.ty.mapper;

import com.ty.pojo.Diary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/17 10:39
 */
@Repository
public interface DiaryMapper {

    /**
     * 返回所有日记信息
     * @return
     */
    List<Diary> getAll();

    /**
     * 返回日期中包含的所有年份
     * @return
     */
    List<Integer> getYear();
}
