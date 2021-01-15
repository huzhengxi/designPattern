package com.jason.design.pattern.behavioral.visitor;

public class FreeCourse extends Course{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
