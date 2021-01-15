package com.jason.design.pattern.behavioral.chainofresponsibility;

public class PPTApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (!course.getPPT().isEmpty()) {
            System.out.println(course.getName() + "包含PPT，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不包含PPT，不批准，流程结束");
        }
    }
}
