package com.jason.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    /**
                     * 1.分配内存给对象
                     * 2.初始化对象
                     * 3.设置 lazyDoubleCheckSingleton 指向刚分配的内存
                     */
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
