package com.o0u0o.dessign.principle.dependenceiversion;

/**
 * TODO
 *
 * @author mac
 * @date 2022/2/11 3:56 PM
 */
public class Test {

    /**
     * v1 对象耦合方式
     * 缺点：需要关心具体的实现
     * @param args
     */
//    public static void main(String[] args) {
//        Tom tom = new Tom();
//        tom.studyJavaCourse();
//        tom.studyVueCourse();
//    }

    /**
     * v2 通过接口方法的方式来注入具体的实现
     * 如：注入JavaCourse的实现
     * @param args
     */
//    public static void main(String[] args) {
//        Tom tom = new Tom();
//        tom.studyCourse(new JavaCourse());
//        tom.studyCourse(new VueCourse());
//        tom.studyCourse(new PythonCourse());
//    }


    /**
     * v3 通过构造器注入
     * 这种方式只有在构造的时候才能注入进去 spring中默认为单例模式。
     * 如果还想学其他课程需要重新new对象
     * @param args
     */
//    public static void main(String[] args) {
//        Tom tom = new Tom(new JavaCourse());
//        tom.studyCourse();
//    }

    /**
     * V4 通过setter方式注入，这种注入方式的优点就说无需利用构造器
     * 使用构造器注入的缺点：
     * @param args
     */
    public static void main(String[] args) {
        TomV4 tomV4 = new TomV4();
        tomV4.setiCourse(new JavaCourse() );
        tomV4.setiCourse(new PythonCourse());
    }


}
