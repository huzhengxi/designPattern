package com.jason.design.pattern.structural.proxy;

public class Order {
    private Object oderInfo;
    private Integer userId;

    public Object getOderInfo() {
        return oderInfo;
    }

    public void setOderInfo(Object oderInfo) {
        this.oderInfo = oderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
