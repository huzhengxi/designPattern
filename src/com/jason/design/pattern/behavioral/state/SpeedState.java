package com.jason.design.pattern.behavioral.state;

public class SpeedState extends CourseVideoState{
    @Override
    public void play() {
        courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进播放课程视频状态");
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
