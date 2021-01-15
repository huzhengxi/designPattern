package com.jason.design.pattern.creational.singleton;

import java.io.Serializable;

public class HungarySingleton implements Serializable, Cloneable {


    private final static HungarySingleton hungaruSingleton;

    static {
        hungaruSingleton = new HungarySingleton();
    }

    private HungarySingleton() {

        //防止反射
        if (hungaruSingleton != null) {
            throw new RuntimeException("单例模式不允许反射");
        }
    }

    public static HungarySingleton getInstance() {
        return hungaruSingleton;
    }

    private Object readResolve() {
        return hungaruSingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
