package com.jason.design.pattern.structural.adapter.classadapter;

public class ConcreteTarget  implements  Target{

    @Override
    public void request() {
        System.out.println("具体实现类的请求");
    }
}
