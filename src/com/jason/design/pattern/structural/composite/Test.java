package com.jason.design.pattern.structural.composite;

/**
 * 组合模式
 * 定义：将对象组合成树形结构以表示“部分-整体”的层次结构
 * 组合模式使客户端对单个对象和组合对象保持一致的方式处理
 * <p>
 * 类型：结构型
 * <p>
 * 适用场景：1.希望客户端可以忽略组合对象与单个对象的差异时
 * 2.处理一个树形机构时
 * <p>
 * 优点：清楚地定义分层次的复杂对象，表示对象的全部或者部分层次。让客户端忽略了层次的差异，方便对整个层次结构进行控制
 * 简化了客户端代码
 * 符合开闭原则
 * <p>
 * 缺点：限制类型时会较为复杂
 * 使设计变得更加抽象
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Window课程", 22);

        CatalogComponent javaCourseCataLog = new CourseCatalog("Java课程目录", 2);

        CatalogComponent mallCourse1 = new Course("Java电商一期", 33);
        CatalogComponent mallCourse2 = new Course("Java电商一期", 55);
        CatalogComponent designPattern = new Course("设计模式", 77);

        javaCourseCataLog.add(mallCourse1);
        javaCourseCataLog.add(mallCourse2);
        javaCourseCataLog.add(designPattern);

        CatalogComponent courseMainCatalog = new CourseCatalog("慕课网课程主目录", 1);

        courseMainCatalog.add(linuxCourse);
        courseMainCatalog.add(windowsCourse);
        courseMainCatalog.add(javaCourseCataLog);

        courseMainCatalog.print();
    }
}
