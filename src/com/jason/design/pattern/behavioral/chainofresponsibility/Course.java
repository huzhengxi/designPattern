package com.jason.design.pattern.behavioral.chainofresponsibility;

public class Course {
    private String name = "";
    private String video = "";
    private String artical = "";
    private String PPT = "";


    public String getPPT() {
        return PPT;
    }

    public void setPPT(String PPT) {
        this.PPT = PPT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getArtical() {
        return artical;
    }

    public void setArtical(String artical) {
        this.artical = artical;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", video='" + video + '\'' +
                ", artical='" + artical + '\'' +
                ", PPT='" + PPT + '\'' +
                '}';
    }
}
