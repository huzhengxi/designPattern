package com.jason.design.pattern.structural.dacorator.v2;

public class AbstractDecarator extends ABatterycake {
    private ABatterycake aBatterycake;

    public AbstractDecarator(ABatterycake aBatterycake) {
        this.aBatterycake = aBatterycake;
    }

    @Override
    protected String getDesc() {
        return this.aBatterycake.getDesc();
    }

    @Override
    protected int coast() {
        return this.aBatterycake.coast();
    }
}
