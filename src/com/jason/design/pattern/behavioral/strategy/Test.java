package com.jason.design.pattern.behavioral.strategy;

/**
 * 策略模式
 * 定义：定义了算法家族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化不会影响到使用算法的用户
 * 应用：大量的if...else...
 * 类型：行为型
 * <p>
 * 适用场景：1.系统有很多类，而他们的区别仅仅在于他们的行为不同
 * 2.一个系统需要动态的在几种算法中选择一种
 * <p>
 * 优点：1.开闭原则 2.避免使用多重条件转移语句 3.提高算法的保密性和安全性
 * 缺点：1.客户端必须知道所有的策略类，并自行决定使用哪一个策略类
 * 2.产生很多策略类
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        promotionActivity618.executePromotionStrategy();


        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
        promotionActivity1111.executePromotionStrategy();
    }
}
