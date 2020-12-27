package com.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author lc
 * @date 2020/12/27 15:36
 */
@Controller
public class RecordController {
    @RequestMapping("a")
    public String test(){
        return "abc";
    }
}
