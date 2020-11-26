package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
/**
 *  定义消息的推送管道
 *  引入Source包（输出管道）
 *  生产者：StringCloud Stream(Source,Channel,Binder)
 *  消费者：StringCloud Stream(Sink,Channel,Binder)
 */
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {
    @Value("${server.port}")
    private String serverPort;

    /**
     * 输入源
     *
     * @param message
     */
    @StreamListener(Sink.INPUT)//监听输入源
    public void input(Message<String> message) {
        System.out.println("消费者1号,----->接受到的消息: " + message.getPayload() + "\t  port: " + serverPort);
    }
}
