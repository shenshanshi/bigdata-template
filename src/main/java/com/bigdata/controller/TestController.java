package com.bigdata.controller;

import com.bigdata.common.controller.BaseController;
import com.bigdata.common.domain.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @GetMapping("/hello")
    public AjaxResult hello(){
        return AjaxResult.success("hello bigdata!");
    }

}
