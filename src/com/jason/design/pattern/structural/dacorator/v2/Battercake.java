package com.jason.design.pattern.structural.dacorator.v2;

public class Battercake extends ABatterycake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int coast() {
        return 8;
    }


}
