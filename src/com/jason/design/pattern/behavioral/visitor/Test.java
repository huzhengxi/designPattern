package com.jason.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式：
 * 定义：封装作用于数据机构（入List/Set/Map等）中的个元素的操作
 * 可以在不改变各元素的类的前提下，定义作用于这些元素的操作
 * <p>
 * 类型：行为型
 * <p>
 * 适用场景：1.一个数据结构（如：list/Set/Map等）包含很多类型对象
 * 2.数据机构与数据操作分离
 * <p>
 * 优点：1.增加新的操作很容易，即增加一个新的访问者
 * <p>
 * 缺点：1.增加新的数据结构困难
 * 2.具体元素的变更比较麻烦
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("Spring MVC数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}
