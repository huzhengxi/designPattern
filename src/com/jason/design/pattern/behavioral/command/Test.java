package com.jason.design.pattern.behavioral.command;

/**
 * 命令模式：
 * 定义：将“请求”封装成对象，以便使用不同的请求
 * 特点：命令模式解决了应用程序中对象的职责以及他们之间的通信方式
 * 类型：行为型
 * 适用场景：1.请求调用者和请求接受者需要解耦，使得调用者和接受者不直接交互
 * 2.需要抽象出等待执行的行为
 * <p>
 * 优点：1. 降低耦合 2.容易扩展新命令或者一组命令
 * <p>
 * 缺点：1. 命令的无线扩展会增加类的数量，提高系统实现的复杂度
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo= new CourseVideo("Java设计模式");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }
}
