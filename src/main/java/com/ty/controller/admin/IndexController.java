package com.ty.controller.admin;

import com.ty.service.ArticleService;
import com.ty.service.MessageService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/24 9:28
 *
 * 主页相关API
 */
@Api(value = "主页相关API")
@Controller
@RequestMapping(value = "admin")
@Slf4j
public class IndexController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private MessageService messageService;

    @GetMapping({"index"})
    public String index(Model model){
        /*文章总数*/
        int size1 = articleService.queryArticle().size();
        /*留言总数*/
        int size2 = messageService.queryMessage().size();

        model.addAttribute("size1",size1);
        model.addAttribute("size2",size2);


        return "admin/index";
    }

}
