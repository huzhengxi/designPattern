package com.jason.design.principle.dependenceinversion;

public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("正在学习Python课程");
    }
}
