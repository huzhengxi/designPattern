package com.jason.design.principle.dependenceinversion;

public class JavaCourse  implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("正在学习Java课程");
    }
}
