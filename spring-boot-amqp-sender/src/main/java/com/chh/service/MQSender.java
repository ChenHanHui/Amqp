package com.chh.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * @author 陈汉辉
 * @since 2024-03-15 星期五 14:12:51
 * <p>
 * 消息发送者
 */
//@Slf4j
@Service
public class MQSender {

    @Resource
    private RabbitTemplate rabbitTemplate;

    /**
     * 发送消息
     */
    public void send(Object msg) {
//        log.info("发送消息-" + msg);
        //没有指定交换机会走默认的交换机，AMQP default
        //AMQP default是一个direct路由模式的交换机
        rabbitTemplate.convertAndSend("queue", msg);
    }

}
