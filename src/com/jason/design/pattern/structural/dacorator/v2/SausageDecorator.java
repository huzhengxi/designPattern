package com.jason.design.pattern.structural.dacorator.v2;

public class SausageDecorator extends AbstractDecarator {
    public SausageDecorator(ABatterycake aBatterycake) {
        super(aBatterycake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int coast() {
        return super.coast() + 2;
    }
}
