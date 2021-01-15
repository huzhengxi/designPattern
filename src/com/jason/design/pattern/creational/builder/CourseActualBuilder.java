package com.jason.design.pattern.creational.builder;

public class CourseActualBuilder extends CourseBuider {
    private Course course = new Course();

    @Override
    public void buiderCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    @Override
    public void builderCoursePPT(String coursePPT) {
        this.course.setCoursePPT(coursePPT);
    }

    @Override
    public void builderCourseArtical(String courseArtical) {
        this.course.setCourseArtical(courseArtical);
    }

    @Override
    public void builderCourseVideo(String courseVideo) {
        this.course.setCourseVideo(courseVideo);
    }

    @Override
    public void builderCourseQA(String courseQA) {
        this.course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return this.course;
    }
}
