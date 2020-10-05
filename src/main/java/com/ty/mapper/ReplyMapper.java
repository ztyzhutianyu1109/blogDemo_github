package com.ty.mapper;

import com.ty.pojo.Reply;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/17 16:48
 */
@Repository
public interface ReplyMapper {

    /**
     * 返回所有回复信息
     * @return
     */
    List<Reply> getAll();
}
