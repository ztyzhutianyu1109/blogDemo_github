package com.ty.service.Impl;

import com.ty.mapper.ReadMapper;
import com.ty.pojo.Contents;
import com.ty.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/19 10:44
 */
@Service
public class ReadServiceImpl implements ReadService {

    @Autowired
    private ReadMapper readMapper;

    @Override
    public Contents getArticleById(Integer cid) {
        return readMapper.getArticleById(cid);
    }
}
