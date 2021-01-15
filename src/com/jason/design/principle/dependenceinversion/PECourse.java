package com.jason.design.principle.dependenceinversion;

public class PECourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("正在学习PE课程");
    }
}
