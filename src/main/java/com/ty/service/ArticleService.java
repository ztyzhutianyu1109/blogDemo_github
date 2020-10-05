package com.ty.service;

import com.ty.pojo.Contents;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/22 8:30
 */
public interface ArticleService {

    /**
     * 返回所有文章
     * @return
     */
    List<Contents> queryArticle();


}
