package com.chh.controller;

import com.chh.service.MQSender;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 陈汉辉
 * @since 2024-03-15 星期五 14:17:23
 */
@Controller
public class RabbitMQController {

    // 装配MQSender
    @Resource
    private MQSender mqSender;

    /**
     * 调用消息生产者，发送消息
     */
    @RequestMapping("/mq")
    @ResponseBody
    public Object mq() {
        mqSender.send("hello mq");
        return "Ok";
    }
}
