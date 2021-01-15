package com.jason.design.pattern.creational.builder.v2;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArtical;
    private String courseQA;


    public Course(CourseBuider courseBuider) {
        this.courseName = courseBuider.courseName;
        this.coursePPT = courseBuider.coursePPT;
        this.courseQA = courseBuider.courseQA;
        this.courseVideo = courseBuider.courseVideo;
        this.courseArtical = courseBuider.courseArtical;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArtical='" + courseArtical + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class CourseBuider {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArtical;
        private String courseQA;

        public CourseBuider buiderCouseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuider buiderCousePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuider buiderCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuider buiderCourseArtical(String courseArtical) {
            this.courseArtical = courseArtical;
            return this;
        }

        public CourseBuider buiderCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }


}
