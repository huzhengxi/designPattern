package com.jason.design.pattern.behavioral.strategy;

public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满100立减1");
    }
}
