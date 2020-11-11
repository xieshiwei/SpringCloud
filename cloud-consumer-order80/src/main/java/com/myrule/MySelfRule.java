package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon负载均衡设置
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        //随机
        return new RandomRule();
    }
}
