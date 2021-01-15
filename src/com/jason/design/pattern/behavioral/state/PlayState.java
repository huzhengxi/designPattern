package com.jason.design.pattern.behavioral.state;

public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("正常播放课程视频状态");
    }

    @Override
    public void speed() {
        courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
