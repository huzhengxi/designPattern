package com.jason.design.pattern.behavioral.templatemethod;

public abstract class ACourse {
    protected final void makeCourse() {
        makePPT();
        makeVideo();
        if (needWriteArtical()) {
            writeArtical();
        }
        packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArtical() {
        System.out.println("编写手记");
    }

    protected boolean needWriteArtical() {
        return false;
    }

    abstract void packageCourse();
}
