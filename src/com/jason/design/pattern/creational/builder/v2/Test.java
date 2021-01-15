package com.jason.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuider().buiderCouseName("java设计模式精讲").build();
        System.out.println(course);
    }
}
