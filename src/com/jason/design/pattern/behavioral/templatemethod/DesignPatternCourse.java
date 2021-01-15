package com.jason.design.pattern.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程JAVA源代码");
    }

    @Override
    protected boolean needWriteArtical() {
        return true;
    }
}
