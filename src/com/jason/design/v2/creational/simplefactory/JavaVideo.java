package com.jason.design.v2.creational.simplefactory;

public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("创建Java视频");
    }
}
