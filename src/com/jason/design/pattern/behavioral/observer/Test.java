package com.jason.design.pattern.behavioral.observer;

/**
 * 观察者模式：
 * 定义：定义了对象之间的一对多依赖，让多个观察者对象同时监听某一个主题对象，当主题对象发声变化时，它的所有依赖者（观察者）都会收到通知并更新。
 * 类型：行为型
 * <p>
 * 适用场景：1.关联行为场景，建立一套触发机制
 * <p>
 * 优点：1.观察者和被观察者之间建立了一个抽象的耦合
 * 2.观察者模式支持广播通信
 * <p>
 * 缺点：1.观察者之间有过多的细节依赖、提高时间消耗及程序复杂度
 * 2.使用要得当，要避免循环调用
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher = new Teacher("Alpha");
        course.addObserver(teacher);

        Question question = new Question();
        question.setUserName("Jason");
        question.setQuestionContent("Java主函数如何编写");

        course.produceQuestion(course, question);
    }
}
