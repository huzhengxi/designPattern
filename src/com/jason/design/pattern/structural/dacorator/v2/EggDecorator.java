package com.jason.design.pattern.structural.dacorator.v2;

public class EggDecorator extends  AbstractDecarator{
    public EggDecorator(ABatterycake aBatterycake) {
        super(aBatterycake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int coast() {
        return super.coast() + 4;
    }
}
