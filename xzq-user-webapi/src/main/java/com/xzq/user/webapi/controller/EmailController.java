package com.xzq.user.webapi.controller;

import com.xzq.user.biz.email.service.EmailService;
import com.xzq.user.common.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/simple")
    public ResultVO sendSimpleEmail() {
        emailService.sendSimpleEmail("80992247@qq.com", "你好", "明天去你家里玩");
        return ResultVO.newSuccessResult("success");
    }

    //todo 附件不知道为什么，一直没有发出去？
    @RequestMapping(value = "/attachment")
    public ResultVO sendAttachmentEmail() {
        File file = new File("D:\\123.txt");
        emailService.sendAttachmentEmail("80992247@qq.com", "你好", "明天去你家里玩",file);
        return ResultVO.newSuccessResult("success");
    }

    @RequestMapping(value = "/template")
    public ResultVO sendTemplateEmail() {
        emailService.sendTemplateEmail("80992247@qq.com", "你好", "info.html");
        return ResultVO.newSuccessResult("success");
    }
}
