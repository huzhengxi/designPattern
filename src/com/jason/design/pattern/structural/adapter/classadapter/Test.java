package com.jason.design.pattern.structural.adapter.classadapter;

/**
 * 适配器模式
 * 定义：将一个类的接口转换成客户期望的另一个接口
 * 特点：使原本接口不兼容的类可以一起工作
 * 类型：结构型
 * 适用场景：1.已经存在的类，它的方法和需求不匹配时（方法结果相同或者相似）
 * 2.不是软件设计阶段考虑的设计模式，是随着软件维护，由于不同的产品、不同的厂家造成功能类似而接口不相同的情况下的解决方案。
 * 优点：能提高类的透明性和复用，现有的类复用但不需要改变；目标类和适配器类解耦，提高程序的可扩展性。符合开闭原则。
 * 缺点：适配器在编写过程中需要全面考虑，可能会增加系统的复杂性，增加系统代码可读的难度
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target1 = new Adapter();
        target1.request();
    }
}
