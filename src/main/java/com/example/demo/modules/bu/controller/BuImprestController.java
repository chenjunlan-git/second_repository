package com.example.demo.modules.bu.controller;

import com.example.demo.common.utils.PageUtils;
import com.example.demo.common.utils.R;
import com.example.demo.modules.bu.service.BuImprestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public class BuImprestController {
    @Autowired
    private BuImprestService buImprestService;
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = buImprestService.queryPage(params);

        return R.ok().put("page", page);
    }
}
