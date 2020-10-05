package com.ty.service.Impl;

import com.ty.mapper.ReplyMapper;
import com.ty.pojo.Reply;
import com.ty.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/17 16:56
 */
@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyMapper replyMapper;

    @Override
    public List<Reply> queryReply() {
        return replyMapper.getAll();
    }
}
