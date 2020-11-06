package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName paymentMain8001
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 10/26/2020 10:53 PM
 **/
@SpringBootApplication
@EnableEurekaClient
public class paymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(paymentMain8001.class, args);
    }
}
