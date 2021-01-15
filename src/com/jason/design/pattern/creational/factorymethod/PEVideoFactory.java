package com.jason.design.pattern.creational.factorymethod;


public class PEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PEVideo();
    }
}
