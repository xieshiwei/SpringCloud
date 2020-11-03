package com.springcloud.service;

import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther
 * @create 2020-02-18 10:40
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
