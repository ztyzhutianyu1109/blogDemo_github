package com.ty.mapper;

import com.ty.pojo.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/17 16:13
 */
@Repository
public interface MessageMapper {

    /**
     * 返回所有留言信息
     * @return
     */
    List<Message> getAll();


}
