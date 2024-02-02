package com.o0u0o.dessign.principle.dependenceiversion;

/**
 * Tom类
 *
 * @author mac
 * @date 2022/2/11 4:02 PM
 */
public class Tom {

    /** 声明一个ICourse */
    private ICourse iCourse;



//    /**
//     * v1 通过接口方法的方式注入实现
//     * 也可以通过构造器的方式来实现注入
//     * @param iCourse
//     */
//    public void studyCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }

    public Tom(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.studyCourse();
    }
}
