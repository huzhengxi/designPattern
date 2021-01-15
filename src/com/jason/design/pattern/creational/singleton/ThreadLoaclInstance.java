package com.jason.design.pattern.creational.singleton;

public class ThreadLoaclInstance {
    private static final ThreadLocal<ThreadLoaclInstance> threadLocalInstanceThreadLoacl = new ThreadLocal<ThreadLoaclInstance>() {
        @Override
        protected ThreadLoaclInstance initialValue() {
            return new ThreadLoaclInstance();
        }
    };

    private ThreadLoaclInstance() {

    }

    public static ThreadLoaclInstance getInstance() {
        return threadLocalInstanceThreadLoacl.get();
    }
}
