package com.yohanii.design_pattern.strategy;

public class PercentDiscountStrategy implements DiscountStrategy {

    private static final int DISCOUNT_PERCENT = 20;

    @Override
    public String getType() {
        return "PercentDiscountStrategy";
    }

    @Override
    public double getDiscountPrice(int price) {
        return price * ((100D - DISCOUNT_PERCENT) / 100);
    }
}
