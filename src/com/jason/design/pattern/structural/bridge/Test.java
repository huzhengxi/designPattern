package com.jason.design.pattern.structural.bridge;

/**
 * 桥接模式
 * 定义：将抽象部分与它的具体实现部分隔离，使它们都可以独立的变化
 * 通过组合的方式建立两个类之间的联系，而不是继承
 * 类型：结构型
 * <p>
 * 适用场景：1.抽象和具体实现之间增加更多的灵活性
 * 2.一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行扩展
 * 3.不希望使用继承，或因为多层继承导致系统类的个数剧增
 * <p>
 * 优点：1.分离抽象部分及其具体实现部分
 * 2.提高了系统的可扩展性
 * 3.符合开闭原则
 * 4.符合合成复用原则
 * <p>
 * 缺点：1.增加了系统的理解与设计难度
 * 2.需要正确识别出系统中两个独立变化的维度
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account account1 = abcBank.openAccount();
        account1.showAccountType();

    }
}
