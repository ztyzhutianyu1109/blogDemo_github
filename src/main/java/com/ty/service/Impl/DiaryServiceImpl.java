package com.ty.service.Impl;

import com.ty.mapper.DiaryMapper;
import com.ty.pojo.Diary;
import com.ty.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/17 10:41
 */
@Service
public class DiaryServiceImpl implements DiaryService {
    @Autowired
    private DiaryMapper diaryMapper;

    @Override
    public List<Diary> queryDiary() {
        return diaryMapper.getAll();
    }

    @Override
    public List<Integer> getYear() {
        return diaryMapper.getYear();
    }
}
