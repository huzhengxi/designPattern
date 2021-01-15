package com.jason.design.principle.dependenceinversion;

/**
 *
 * 依赖倒置原则
 *   定义：高层模块不应该依赖底层模块，二者都应该依赖其抽象模块
 *   抽象不应该一类细节；细节应该依赖抽象
 *   针对接口编程，不要针对实现编程。
 *   优点：可以减少类之间的耦合性、提高系统稳定性，提高代码可读性和可维护性，可以降低修改程序所造成的风险。
 *
 */
public class Test {
    //    public static void main(String[] args) {
//        Jason jason = new Jason();
//        jason.studyJavaCourse();
//        jason.studyPECource();
//    }

    //V2
//    public static void main(String[] args) {
//        Jason jason = new Jason();
//        jason.studyImoocCource(new JavaCourse());
//        jason.studyImoocCource(new PECourse());
//        jason.studyImoocCource(new PythonCourse());
//    }

//    public static void main(String[] args) {
//        Jason jason = new Jason(new JavaCourse());
//        jason.studyImoocCource();
//        Jason jason1 = new Jason(new PythonCourse());
//        jason1.studyImoocCource();
//    }

    public static void main(String[] args) {
        Jason jason = new Jason();
        jason.setCourse(new JavaCourse());
        jason.studyImoocCource();
        jason.setCourse(new PythonCourse());
        jason.studyImoocCource();
    }
}
