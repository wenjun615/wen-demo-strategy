package com.wen.strategy.service;

import com.wen.strategy.entity.Order;
import com.wen.strategy.common.PayResult;

/**
 * <p>
 * 支付接口
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
public interface IPayment {

    /**
     * 支付
     *
     * @param order 订单
     * @return 返回结果
     */
    PayResult pay(Order order);
}
