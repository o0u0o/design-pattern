package com.o0u0o.dessign.principle.singleresponsibility;

/**
 * 课程管理业务接口
 *
 * @author mac
 * @date 2022/2/11 4:46 PM
 */
public interface ICourseManager {

    /**
     * 上课
     */
    void studyCourse();
    /**
     * 退课 退课后不能学习课程可播放视频
     */
    void refundCourse();
}
