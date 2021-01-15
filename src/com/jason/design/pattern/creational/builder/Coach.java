package com.jason.design.pattern.creational.builder;

public class Coach {
    private CourseBuider courseBuider;

    public void setCourseBuider(CourseBuider courseBuider) {
        this.courseBuider = courseBuider;
    }

    public Course makeCourse(String courseName, String coursePPT, String courseVideo, String courseArtical, String courseQA) {
        this.courseBuider.buiderCourseName(courseName);
        this.courseBuider.builderCoursePPT(coursePPT);
        this.courseBuider.builderCourseQA(courseQA);
        this.courseBuider.builderCourseArtical(courseArtical);
        this.courseBuider.builderCourseVideo(courseVideo);
        return this.courseBuider.makeCourse(); 
    }
}
