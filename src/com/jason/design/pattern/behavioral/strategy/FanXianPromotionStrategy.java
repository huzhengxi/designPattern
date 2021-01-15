package com.jason.design.pattern.behavioral.strategy;

public class FanXianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现策略，满200返10");
    }
}
