package com.o0u0o.dessign.principle.dependenceiversion;


/**
 * TomV4 通过setter方式注入
 *
 * @author mac
 * @date 2022/2/11 4:16 PM
 */
public class TomV4 {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.studyCourse();
    }
}
