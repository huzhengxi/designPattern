package com.jason.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式
 * 定义：想确保任何情况下都绝对只有一个实例
 * <p>
 * 优点：在内存里只有一个实例，减少了内存开销
 * 可以避免对资源的多重占用
 * 设置了全局的访问点，严格控制访问。
 * <p>
 * 缺点：没有借口，扩展困难
 * <p>
 * 重点：私有构造器、线程安全、延迟加载、序列化和反序列化安全、反射
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        HungarySingleton instance = HungarySingleton.getInstance();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        objectOutputStream.writeObject(instance);

//        File file = new File("singleton_file");
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//        HungarySingleton newInstance = (HungarySingleton) objectInputStream.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        Class objectClass = StaticInnerClassSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(newInstance == instance);


//        EnumInstance instance = EnumInstance.getInstance();
//        System.out.println(instance);

        System.out.println(ThreadLoaclInstance.getInstance());
        System.out.println(ThreadLoaclInstance.getInstance());
        System.out.println(ThreadLoaclInstance.getInstance());
        Thread thread = new Thread(new T());
        Thread thread1 = new Thread(new T());
        thread.start();
        thread1.start();
    }

}
