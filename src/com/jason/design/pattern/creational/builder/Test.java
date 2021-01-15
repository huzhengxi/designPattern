package com.jason.design.pattern.creational.builder;

/**
 * 建造者模式：
 * 定义：将一个复杂对象的构造与它的表示分离，是的同样的构建过程可以创建不同的表示。
 * 特征：用户是需要指定需要建造的类型就可以得到它们，建造过程及细节不需要知道。
 * 使用场景：如果一个对象有非常复杂的内部结构（很多属性）。想把复杂的对象的创建和使用分离。
 * 优点：封装性好，创建和使用分离。扩展性好，	建造类之间独立，一定程度上解耦。
 * 缺点：产生多余的Builder对象。产品内部发生变化，建造者都要修改，成本比较大。
 */
public class Test {
    public static void main(String[] args) {
        CourseBuider courseBuider = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuider(courseBuider);
        Course course = coach.makeCourse("java设计模式精讲","java设计模式精讲PPT",
                "java设计模式精讲视频","java设计模式精讲手记","java设计模式精讲问答");
        System.out.println(course);
    }
}
