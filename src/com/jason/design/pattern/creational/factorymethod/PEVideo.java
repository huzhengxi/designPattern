package com.jason.design.pattern.creational.factorymethod;

public class PEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制前端视频");
    }
}
