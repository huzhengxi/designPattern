package com.jason.design.pattern.creational.singleton;

public class T implements Runnable {

    @Override
    public void run() {
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
//        HungarySingleton hungarySingleton = HungarySingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + " " + hungarySingleton);
        ThreadLoaclInstance threadLoaclInstance = ThreadLoaclInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + threadLoaclInstance);

        ThreadLoaclInstance threadLoaclInstance1 = ThreadLoaclInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + threadLoaclInstance1);

        ThreadLoaclInstance threadLoaclInstance2 = ThreadLoaclInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + threadLoaclInstance2);
    }
}
