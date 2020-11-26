package com.springcloud.service.impl;

import com.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;


//@Service 直接和通道和绑定器打交道，不需要service了

/**
 * 定义消息的推送管道
 * 引入Source包（输出管道）
 * 生产者：StringCloud Stream(Source,Channel,Binder)
 * 消费者：StringCloud Stream(Sink,Channel,Binder)
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    /**
     * 消息的发送管道
     */
    @Resource
    private MessageChannel output;

    /**
     * 发送
     *
     * @return
     */
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        //把内容构建到MessageChannel管道中
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("**********************serial：" + serial);
        return serial;
    }
}

