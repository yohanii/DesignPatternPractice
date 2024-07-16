package com.yohanii.design_pattern.strategy;

public interface DiscountStrategy {

    public String getType();

    public double getDiscountPrice(int price);
}
