package com.jason.design.pattern.behavioral.state;

public class PauseState extends CourseVideoState{
    @Override
    public void play() {
        courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停播放课程视频状态");
    }

    @Override
    public void stop() {
        courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
