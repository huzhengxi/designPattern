package com.jason.design.pattern.behavioral.command;

public class CourseVideo {
    String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "课程视频开放");
    }

    public void close() {
        System.out.println(this.name + "课程关闭");
    }

}
