/**
 * Project Name:spring-boot-frame
 * File Name:EmailController
 * Package Name:com.bbrightway.Email.web
 * Date:2018/6/21 19:54
 * Copyright (c) 2018, 北京名道恒通信息技术有限公司 All Rights Reserved.
 */
package com.bbrightway.Email.web;

import com.bbrightway.utils.EmailUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:  EmailController
 * Function:   TODO
 * Date:   2018/6/21 19:54
 *
 * @author lixueyun
 * @version 3.0
 */
@RestController
@Api(tags = "EmailController", description = "发邮件API")
public class EmailController {

    @ApiOperation(value="测试发送邮件", notes="测试发送邮件")
    @RequestMapping(value = "sendEmail",method = RequestMethod.POST)
    public String sendEmail(){
        boolean isSend = EmailUtils.sendEmail("这是一封测试邮件", new String[]{"lixueyun@bbrightway.com"}, null, "<h3><a href='http://www.baidu.com'>百度一下，你就知道</a></h3>", null);
        return "发送邮件:" + isSend;
    }
}
