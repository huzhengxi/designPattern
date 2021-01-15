package com.jason.design.v2.creational.simplefactory;

import java.lang.reflect.InvocationTargetException;

public class VideoFactory {
    public Video getVideo(Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Video video = null;
        video = (Video) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        return video;
    }

}
