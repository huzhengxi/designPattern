package com.jason.design.pattern.behavioral.chainofresponsibility;

public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (!course.getVideo().isEmpty()) {
            System.out.println(course.getName() + "包含视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不包含视频，不批准，结束");
            return;
        }
    }
}
