package com.jason.design.pattern.creational.prototype;

/**
 * 原型模式：
 * 定义：指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * <p>
 * 特点：不需要知道任何创建的细节，不调用构造函数
 * <p>
 * 类型：创建型
 * <p>
 * 使用场景：类初始化消耗较多资源
 * new 产生的一个对象需要非常繁琐的过程（数据准备、访问权限等）
 * 构造函数比较复杂
 * 循环体中产生大量的对象
 * <p>
 * 优点： 原型模式性能比直接new一个对象性能高
 * 简化创建过程
 * <p>
 * 缺点：1.必须配备克隆方法
 * 2.对克隆复杂对象或者对克隆出的对象进行复杂改造时，容易引入风险
 * 3.深拷贝、浅拷贝要运作得当。
 * <p>
 * 原型扩展：
 * 深克隆：对引用类型，如果需要它们指向不同的对象，我们一定要使用深克隆
 * 浅克隆
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板" + mail);
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@163.com");
            mailTemp.setContent("恭喜您，此次摇号中奖了！");
            MailUtil.sendMail(mailTemp);
            System.out.println("初始化mail：" + mail + ", 克隆的mailTemp：" + mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
