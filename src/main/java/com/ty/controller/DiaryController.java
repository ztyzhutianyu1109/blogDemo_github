package com.ty.controller;

import com.ty.pojo.Diary;
import com.ty.service.DiaryService;
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
 * @Data 2020/9/17 9:48
 *
 *  日记相关API
 */
@Api(value = "日记相关API")
@Controller
@RequestMapping(value = "diary")
@Slf4j
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    @ApiOperation(value = "跳转到日记页面首页")
    @GetMapping
    public String toDiaryPage(Model model){
        List<Diary> list = diaryService.queryDiary();
        List<Integer> years = diaryService.getYear();
        log.info("跳转到日记页面首页,查询所有日记信息,输出{},查询到的所有年份信息为:{}",list,years);
        model.addAttribute("lists",list);
        model.addAttribute("years",years);
        return "blog/diary";
    }


}
