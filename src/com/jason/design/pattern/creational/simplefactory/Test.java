package com.jason.design.pattern.creational.simplefactory;

/**
 * 简单工厂
 * 定义：由一个工厂对象决定创建出哪一种产品类的实例
 * <p>
 * 类型：创建型
 * <p>
 * 适用场景：1.工厂类负责创建的对象比较少
 * 2. 客户端（应用层）只知道传入工厂类的参数，对于如何创建对象（逻辑)不关系
 * <p>
 * 优点：只需要传入一个正确的参数，就可以获取你所需要的对象，而无需知道其创建细节
 * <p>
 * 缺点：工厂类的职责相对过重，增加新的产品需要修改工厂类的判断逻辑，违背了开闭原则
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
