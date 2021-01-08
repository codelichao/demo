package com.lc.controller;


import com.lc.servcie.EmailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "邮件")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @ApiOperation(value = "发送邮件")
    @RequestMapping("simpleEmail")
    @ResponseBody
    public String sendSimpleEmail() {
        emailService.sendSimpleMail("545438496@qq.com", "马：找规律", "马不停蹄，马失前蹄，马到成功，马革裹尸，一马当先，老马识途，万马奔腾，牛头马面，人仰马翻，越前龙马");
        return "success";
    }

}

