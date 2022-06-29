package com.wen.strategy.service.impl;

import com.wen.strategy.common.PayResult;
import com.wen.strategy.entity.Order;
import com.wen.strategy.service.IPayment;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 银联云闪付
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
@Service("UnionPay")
public class UnionPay implements IPayment {

    @Override
    public PayResult pay(Order order) {
        return new PayResult("云闪付支付成功");
    }
}
