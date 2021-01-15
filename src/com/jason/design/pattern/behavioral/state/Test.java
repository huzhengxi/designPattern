package com.jason.design.pattern.behavioral.state;

/**
 * 状态模式
 * 定义：允许一个对象在其内部状态改变时，改变它的行为
 * 类型：行为型
 * <p>
 * 适用场景：1.一个对象存在多个状态（不同状态下行为不同），且状态可以相互转换
 * <p>
 * 优点：1.将不同的状态隔离
 * 2.把各个状态的转换逻辑，分布到state的子类中，减少相互依赖
 * 3.增加新的状态非常简单
 * <p>
 * 缺点：状态多的业务场景导致类的数目增加，系统变复杂
 */
public class Test {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.pause();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());


    }
}
