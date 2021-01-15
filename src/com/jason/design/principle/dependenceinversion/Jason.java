package com.jason.design.principle.dependenceinversion;

public class Jason {
    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void studyImoocCource(){
        this.course.studyCourse();
    }
}
