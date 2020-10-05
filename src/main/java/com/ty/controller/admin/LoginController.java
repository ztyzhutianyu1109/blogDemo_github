package com.ty.controller.admin;

import com.ty.common.domain.RestResponse;
import com.ty.service.ArticleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 天宇宇宇宇宇
 * @Data 2020/9/21 20:49
 *
 * 登录相关API
 */
@Api(value = "登录相关API")
@Controller
@RequestMapping(value = "admin")
@Slf4j
public class LoginController {

    @GetMapping
    public String toLoginPage(){
        log.info("登录");
        return "admin/login";
    }

    /**
     * 管理员登录
     * @param username
     * @param password
     * @return
     */
    @PostMapping(value = "login")
    @ResponseBody
    public RestResponse login(String username, String password){
        System.out.println(username+" "+password);
        if ("admin".equals(username) && "123456".equals(password)){
            log.info("登陆成功");
            return RestResponse.success();
        }
        return RestResponse.validfail("账户或密码错误");
    }

    /**
     * 管理员注销
     * @return
     */
    @GetMapping("logout")
    public String logout(){
        log.info("管理员注销");
        return "admin/login";
    }
}
