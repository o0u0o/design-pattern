package com.o0u0o.dessign.principle.dependenceiversion;

/**
 * 依赖倒置原则的演示
 *
 * @author mac
 * @date 2022/2/11 3:54 PM
 */
public class TomV1 {

    /**
     * 学习java课程的方法
     * 1、如果需要学习python，Tom类中加入studyPythonCourse. 这就是在面向实现编程。
     */
    public void studyJavaCourse(){
        System.out.println("Tom在学习Java课程");
    }

    public void studyVueCourse(){
        System.out.println("Tom在学习Vue课程");
    }

    public void studyPythonCourse(){
        System.out.println("Tom在学习Python课程");
    }
}
