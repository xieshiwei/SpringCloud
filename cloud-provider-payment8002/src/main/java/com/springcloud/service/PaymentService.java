package com.springcloud.service;

import com.springcloud.dao.PaymentMapper;
import com.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    /**
     * 创建
     *
     * @param payment
     * @return
     */
    public int create(Payment payment) {
        return paymentMapper.insert(payment);
    }

    /**
     * 获取支付信息
     *
     * @param id
     * @return
     */
    public Payment getPayment(Long id) {
        return paymentMapper.selectByPrimaryKey(id);
    }
}
