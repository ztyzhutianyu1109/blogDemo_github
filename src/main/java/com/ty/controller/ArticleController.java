package com.ty.controller;

import com.ty.pojo.Contents;
import com.ty.service.ArticleService;
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
 * @Data 2020/9/15 19:27
 *
 *  文章相关api
 */
@Api(value = "文章相关API")
@Controller
@RequestMapping(value = "article")
@Slf4j
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @ApiOperation(value = "跳转到文章页面首页")
    @GetMapping
    public String toArticlePage(Model model){

        List<Contents> list = articleService.queryArticle();
        log.info("跳转到文章页面首页,查询到的全部文章为{}",list);
        model.addAttribute("contents",list);
        return "blog/article";
    }

}
