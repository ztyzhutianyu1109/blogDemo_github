package com.ty.service;

import com.ty.pojo.Reply;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/17 16:55
 */
public interface ReplyService {
    /**
     * 返回所有回复信息
     * @return
     */
    List<Reply> queryReply();
}
