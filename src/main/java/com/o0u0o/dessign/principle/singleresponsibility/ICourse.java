package com.o0u0o.dessign.principle.singleresponsibility;

/**
 * TODO
 *
 * @author mac
 * @date 2022/2/11 4:43 PM
 */
public interface ICourse {

    /**
     * 学习课程
     * @return
     */
    String getCourseName();
    /**
     * 播放视频
     * @return
     */
    byte[] getCourseVideo();

    /**
     * 上课
     */
    void studyCourse();
    /**
     * 退课 退课后不能学习课程可播放视频
     */
    void refundCourse();
}
