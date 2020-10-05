package com.ty.controller;


import com.ty.pojo.Message;
import com.ty.pojo.Reply;
import com.ty.service.MessageService;
import com.ty.service.ReplyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/15 20:34
 *
 *  留言相关API
 */
@Api(value = "留言相关API")
@Controller
@RequestMapping(value = "message")
@Slf4j
public class MessageController {

    @Autowired
    private MessageService messageService;
    @Autowired
    private ReplyService replyService;

    @ApiOperation(value = "跳转到留言页面首页")
    @GetMapping
    public String toMessagePage(Model model){
        List<Message> messages = messageService.queryMessage();
        List<Reply> replies = replyService.queryReply();
        log.info("跳转到留言页面首页,查询出的留言数据为:{},回复数据为:{}",messages,replies);
        model.addAttribute("messages",messages);
        model.addAttribute("replies",replies);
        return "blog/message";
    }

}
