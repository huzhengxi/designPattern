package com.jason.design.pattern.behavioral.chainofresponsibility;

public class ArticalApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (!course.getArtical().isEmpty()) {
            System.out.println(course.getName() + "含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不包含手记，不批准，流程结束");
            return;
        }
    }
}
