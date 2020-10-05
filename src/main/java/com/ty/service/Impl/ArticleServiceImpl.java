package com.ty.service.Impl;

import com.ty.mapper.ArticleMapper;
import com.ty.pojo.Contents;
import com.ty.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/22 8:31
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Contents> queryArticle() {
        return articleMapper.getAll();
    }


}
