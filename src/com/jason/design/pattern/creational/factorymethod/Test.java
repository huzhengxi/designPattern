package com.jason.design.pattern.creational.factorymethod;

/**
 * 工厂方法
 * 定义：定义一个创建对象的接口。但让实现这个接口的类来决定实例化哪个类
 * 工厂方法让各类的实例化推迟到子类中进行
 * <p>
 * 类型：创建型
 * <p>
 * 适用场景:1.（同一个产品等级）2.创建对象需要大量的重复代码
 * 3.客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
 * 4.一个类通过其子类来指定创建哪个对象
 * <p>
 * 优点：1.用户只关心所需产品对应的工厂，无须关心创建细节
 * 2.加入新产品符合开闭原则，提高了可扩展性
 * <p>
 * 缺点：1.类想个数容易过多，增加复杂度
 * 2.增加了系统的抽象性和理解难度
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        VideoFactory videoFactory = new PEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
