package com.ty.mapper;

import com.ty.pojo.Contents;
import org.springframework.stereotype.Repository;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/19 10:40
 */
@Repository
public interface ReadMapper {

    Contents getArticleById(Integer cid);

}
