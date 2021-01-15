package com.jason.design.pattern.structural.adapter;

public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public int output5V() {
        int input = ac220.outputAC220V();
        int output = input / 44;
        System.out.println("使用PowerAdapter,输入AC" + input + "V,输出" + output + "V");
        return output;
    }
}
