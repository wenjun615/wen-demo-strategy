package com.wen.strategy.service.impl;

import com.wen.strategy.common.PayResult;
import com.wen.strategy.entity.Order;
import com.wen.strategy.service.IPayment;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付宝支付
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
@Service("Alipay")
public class Alipay implements IPayment {

    @Override
    public PayResult pay(Order order) {
        return new PayResult("支付宝支付成功");
    }
}
