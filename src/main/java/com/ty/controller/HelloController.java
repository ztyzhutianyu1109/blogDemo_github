package com.ty.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/15 17:31
 */
@Controller
@Slf4j
public class HelloController {

    /*跳转到首页*/
    @GetMapping(value = "index")
    public String hello(){
        log.info("跳转到首页");
        return "redirect:/";
    }

}
