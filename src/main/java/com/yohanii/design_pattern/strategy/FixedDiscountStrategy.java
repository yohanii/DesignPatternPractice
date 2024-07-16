package com.yohanii.design_pattern.strategy;

public class FixedDiscountStrategy implements DiscountStrategy {

    private static final int DISCOUNT_AMOUNT = 1000;

    @Override
    public String getType() {
        return "FixedDiscountStrategy";
    }

    @Override
    public double getDiscountPrice(int price) {
        return price - DISCOUNT_AMOUNT;
    }
}
