package com.jason.design.pattern.creational.singleton;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        if (InnnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("禁止反射调用");
        }
    }

    private static class InnnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnnerClass.staticInnerClassSingleton;
    }
}
