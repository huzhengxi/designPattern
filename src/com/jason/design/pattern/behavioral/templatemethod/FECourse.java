package com.jason.design.pattern.behavioral.templatemethod;

public class FECourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程图片等资源");
    }
}
