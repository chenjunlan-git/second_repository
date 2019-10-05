package com.example.demo.modules.oa.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.demo.common.utils.R;
import com.example.demo.modules.oa.entity.OaProTemplateEntity;
import com.example.demo.modules.oa.service.OaProTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 流程模板 前端控制器
 * </p>
 *
 * @author angy
 * @since 2019-06-22
 */
@RequestMapping("/oa/template")
@RestController
public class OaProTemplateController {
    @Autowired
    private OaProTemplateService oaProTemplateService;

    /**
     * 获取列表
     * @return
     */
    @GetMapping("list")
    public R list(){
        return oaProTemplateService.list();
    }
}
