package com.jason.design.pattern.creational.builder;

public abstract class CourseBuider {
    public abstract void buiderCourseName(String courseName);

    public abstract void builderCoursePPT(String coursePPT);

    public abstract void builderCourseArtical(String courseArtical);

    public abstract void builderCourseVideo(String courseVideo);

    public abstract void builderCourseQA(String courseQA);

    public abstract Course makeCourse();
}
