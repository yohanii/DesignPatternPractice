package com.yohanii.design_pattern.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DiscountService {

    private final DiscountStrategy discountStrategy;

    private int price = 0;

    public DiscountService(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print() {
        log.info("Type : " + discountStrategy.getType());
        log.info("DiscountPrice : " + discountStrategy.getDiscountPrice(price));
    }
}
