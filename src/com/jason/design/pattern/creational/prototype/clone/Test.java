package com.jason.design.pattern.creational.prototype.clone;

import com.jason.design.pattern.creational.singleton.HungarySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(6666L);

        System.out.println(pig1);
        System.out.println(pig2);

//        HungarySingleton hungarySingleton = HungarySingleton.getInstance();
//        Method method = hungarySingleton.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungarySingleton hungarySingleton1 = (HungarySingleton) method.invoke(hungarySingleton);
//
//        System.out.println(hungarySingleton);
//        System.out.println(hungarySingleton1);
    }
}
