package com.ty.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/15 21:04
 *
 *  友链相关API
 */
@Api(value = "友链相关API")
@Controller
@RequestMapping(value = "link")
@Slf4j
public class LinkController {

    @ApiOperation(value = "跳转到友链页面首页")
    @GetMapping
    public String toLinkPage(){
        log.info("跳转到友链页面首页");
        return "redirect:/link.html";
    }

}
