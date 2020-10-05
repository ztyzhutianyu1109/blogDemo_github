package com.ty.service.Impl;

import com.ty.mapper.MessageMapper;
import com.ty.pojo.Message;
import com.ty.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/17 16:19
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public List<Message> queryMessage() {
        return messageMapper.getAll();
    }
}
