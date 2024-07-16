package com.yohanii.design_pattern.strategy;

public class UnionDiscountStrategy implements DiscountStrategy {

    private static final int DISCOUNT_AMOUNT = 1000;
    private static final int DISCOUNT_PERCENT = 20;

    @Override
    public String getType() {
        return "UnionDiscountStrategy";
    }

    @Override
    public double getDiscountPrice(int price) {
        return price * ((100D - DISCOUNT_PERCENT) / 100) - DISCOUNT_AMOUNT;
    }
}
