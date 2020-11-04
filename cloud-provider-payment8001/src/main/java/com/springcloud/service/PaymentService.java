package com.springcloud.service;

import com.springcloud.dao.PaymentMapper;
import com.springcloud.dao.model.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    public int create(Payment payment) {
        return paymentMapper.insert(payment);
    }

    public Payment getPayment(Long id) {
        return paymentMapper.selectByPrimaryKey(id);
    }
}
