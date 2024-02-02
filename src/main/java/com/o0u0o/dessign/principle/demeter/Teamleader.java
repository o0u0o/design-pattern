package com.o0u0o.dessign.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 团队领导
 * @author mac
 * @date 2022/2/11 5:32 PM
 */
public class Teamleader {

    /**
     * 查询课程数量
     */
    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.printf("在线课程的数量是:" + courseList.size());
    }
}
