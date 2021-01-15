package com.jason.design.pattern.structural.flyweight;

/**
 * 享元模式：
 * 定义：提供了减少对象数量从而改善应用所需的对象结构的方式
 * 运用共享技术有效的支持大量的细粒度的对象
 * 类型：结构型
 * 适用场景：1.常常应用于系统底层的开发，以便解决系统的性能问题
 * 2.系统有大量相似对象、需要缓冲池场景
 * 优点：减少对象的创建，降低内存中对象的数量，降低系统内存。提高效率
 * 减少内存之外的其他资源占用
 * 缺点：关注内部/外部状态、关注线程安全问题
 * 使系统、程序的逻辑复杂化
 */
public class Test {
    private static final String departments[] = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
