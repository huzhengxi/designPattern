package com.jason.design.pattern.structural.dacorator.v2;

/**
 * 装饰者模式：
 * 定义：在不改变原有对象的基础上，将功能附加到对象上
 * 特点：提供了比继承更有弹性的替代方案（扩展原有对象功能）
 * 类型：结构型
 * 使用场景：1. 扩展一个类的功能或给一个类添加附加职责
 * 2. 动态的给一个对象添加功能，这些功能可以再动态的撤销
 * 优点： 1. 装饰者模式是继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
 * 2. 通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同的效果。
 * 3. 符合开闭原则
 * 缺点： 1. 会出现更多的代码，更多的类，增加程序的复杂性
 * 2. 动态装饰时，多层装饰时会更复杂。
 */
public class Test {
    public static void main(String[] args) {
        ABatterycake aBatterycake = new Battercake();
        aBatterycake = new EggDecorator(aBatterycake);
        aBatterycake = new EggDecorator(aBatterycake);
        aBatterycake = new SausageDecorator(aBatterycake);
        System.out.println(aBatterycake.getDesc() + " 销售价格：" + aBatterycake.coast());


    }
}
