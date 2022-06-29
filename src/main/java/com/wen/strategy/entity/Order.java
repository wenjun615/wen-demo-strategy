package com.wen.strategy.entity;

import lombok.Data;

/**
 * <p>
 * 订单信息
 * </p>
 *
 * @author wenjun
 * @since 2022-06-29
 */
@Data
public class Order {

    /**
     * 金额
     */
    private int amount;

    /**
     * 支付类型
     */
    private String paymentType;
}
