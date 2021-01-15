package com.jason.design.pattern.behavioral.templatemethod;

/**
 * 模板方法模式
 * 定义：定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现
 * 模板方法使得子类可以再不改变算法结构的情况下，重新定义算法的某些步骤
 * 类型：行为型
 * <p>
 * 适用场景：1.一次性实现一个算法的不变部分，并将可变的行为留给子类来实现
 * 2.各子类中公共的行为被提取出来并集中到一个公共父类中，从而避免代码重复
 * <p>
 * 优点：1.提高复用性 2.提高扩展性 3.符合开闭原则
 * <p>
 * 缺点：1.类数目增加 2.增加了系统实现的负责度  3.继承关系自身缺点，如果父类添加了新的抽象方法，所有子类都要改一遍
 * <p>
 * 扩展：1.钩子方法
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start---------");
        ACourse designPattern = new DesignPatternCourse();
        designPattern.makeCourse();
        System.out.println("后端设计模式课程end---------");

        System.out.println("前端课程start------------");
        ACourse feCourse = new FECourse();
        feCourse.makeCourse();
        System.out.println("前端课程end------------");
    }
}
