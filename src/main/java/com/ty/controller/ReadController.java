package com.ty.controller;

import com.ty.pojo.Contents;
import com.ty.service.ReadService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/18 8:21
 *
 *  文章阅读相关API
 */
@Api(value = "文章阅读相关API")
@Controller
@RequestMapping(value = "read")
@Slf4j
public class ReadController {

    @Autowired
    private ReadService readService;

/*    @ApiOperation(value = "跳转到文章阅读页面")
    @GetMapping
    public String toReadPage(){
        log.info("跳转到文章阅读页面");
        return "blog/read";
    }*/

    /**
     * 阅读指定文章
     * @return
     */
    @GetMapping("{cid}")
    public String post(@PathVariable Integer cid, Model model){
        Contents article = readService.getArticleById(cid);
        log.info("查询出的文章信息为:{}",article);
        model.addAttribute("article",article);
        return "blog/read";
    }

}
