package com.o0u0o.dessign.principle.singleresponsibility;

/**
 * 课程实现类
 * @author mac
 * @date 2022/2/11 4:47 PM
 */
public class CourseImpl implements ICourseManager, ICourseContent{
    /**
     * 学习课程
     *
     * @return
     */
    @Override
    public String getCourseName() {
        return null;
    }

    /**
     * 播放视频
     *
     * @return
     */
    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    /**
     * 上课
     */
    @Override
    public void studyCourse() {

    }

    /**
     * 退课 退课后不能学习课程可播放视频
     */
    @Override
    public void refundCourse() {

    }
}
