package com.ty.mapper;

import com.ty.pojo.Contents;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/22 8:23
 */
@Repository
public interface ArticleMapper {

    /**
     * 返回所有文章
     * @return
     */
    List<Contents> getAll();


}
