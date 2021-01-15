package com.jason.design.pattern.behavioral.chainofresponsibility;

/**
 * 责任链模式
 * 定义：为请求创建一个接受此次请求对象的链
 * <p>
 * 类型：行为型
 * <p>
 * 适用场景：一个请求的处理需要多个对象中的一个或者几个协作处理
 * <p>
 * 优点：1.请求的发送者和接受者（请求的处理）解耦
 * 2.责任链可以动态组合
 * <p>
 * 缺点：1.责任链太长或者处理时间过长，影响性能
 * 2.责任链有可能过多
 */
public class Test {
    public static void main(String[] args) {
        Approver articalApprover = new ArticalApprover();
        Approver videoApprover = new VideoApprover();
        Approver pptApprover = new PPTApprover();

        Course course = new Course();
        course.setName("Java设计模式");
//        course.setArtical("Java设计模式手记");
        course.setVideo("Java设计模式视频");
        course.setPPT("Java设计模式PPT");

        articalApprover.setNextApprover(videoApprover);
        videoApprover.setNextApprover(pptApprover);

        articalApprover.deploy(course);
    }
}
