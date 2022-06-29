package com.wen.strategy.controller;

import com.wen.strategy.common.PayResult;
import com.wen.strategy.entity.Order;
import com.wen.strategy.service.IPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 支付服务
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
@RestController
public class PayService {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 支付接口
     *
     * @param amount      金额
     * @param paymentType 支付类型
     * @return 返回结果
     */
    @RequestMapping("/pay")
    public PayResult pay(@RequestParam("amount") int amount,
                         @RequestParam("paymentType") String paymentType) {
        Order order = new Order();
        order.setAmount(amount);
        order.setPaymentType(paymentType);
        // 根据支付类型获取对应的策略 bean
        IPayment payment = applicationContext.getBean(order.getPaymentType(), IPayment.class);
        // 开始支付
        return payment.pay(order);
    }
}
