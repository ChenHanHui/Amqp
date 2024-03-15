package com.chh.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈汉辉
 * @since 2024-03-15 星期五 14:11:16
 *
 * 消费者单纯的使用，其实可以不用添加这个配置，直接监听就好，使用注解来让监听器监听对应的队列即可。配置上了的话，其实消费者也是生成者的身份，也能推送该消息。
 */
@Configuration
public class RabbitMQConfig {

    // 定义队列名
    private static final String QUEUE = "queue";

    /**
     * 创建队列
     * 1. 配置队列
     * 2. 队列名为 queue
     * 3. true 表示: 持久化 (不填，默认为true,默认持久化)
     * durable： 队列是否持久化。 队列默认是存放到内存中的，rabbitmq 重启则丢失，
     * 若想重启之后还存在则队列要持久化，
     * 保存到 Erlang 自带的 Mnesia 数据库中，当 rabbitmq 重启之后会读取该数据库
     */
    @Bean
    public Queue queue() {
        return new Queue(QUEUE, true);
    }

}
