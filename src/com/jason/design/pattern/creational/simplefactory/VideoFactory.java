package com.jason.design.pattern.creational.simplefactory;

public class  VideoFactory {
//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        } else {
//            return null;
//        }
//    }

    public Video getVideo(Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Video video = null;
        video = (Video) Class.forName(c.getName()).newInstance();
        return video;
    }
}
