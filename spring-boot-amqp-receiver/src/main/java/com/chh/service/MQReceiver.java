package com.chh.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author 陈汉辉
 * @since 2024-03-15 星期五 14:15:55
 *
 * 消息接收者
 */
@Service
@Slf4j
public class MQReceiver {

    /**
     * 接收消息
     */
    @RabbitListener(queues = "queue")
    public void receive(Object msg) {
        log.info("接收到消息--" + msg);
    }

}
