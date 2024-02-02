package com.o0u0o.dessign.principle.demeter;


/**
 * Boss 大老板
 * @author mac
 * @since  2022/2/11 5:31 PM
 */
public class Boss {

    /**
     * 下指令让teamleader查询客户才能数量
     * @param teamleader
     */
    public void commandCheckNumber(Teamleader teamleader){
        // teamLeader去查询课程数量
        teamleader.checkNumberOfCourses();
    }
}
