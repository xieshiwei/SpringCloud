package com.springcloud.service;

import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
//找Eureka上名字叫【CLOUD-PAYMENT-SERVICE】的微服务，这个必须和主动启动类上的【EnableEurekaClient】对应
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment);

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
    
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
