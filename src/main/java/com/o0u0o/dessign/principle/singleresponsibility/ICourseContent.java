package com.o0u0o.dessign.principle.singleresponsibility;

/**
 * TODO
 *
 * @author mac
 * @date 2022/2/11 4:46 PM
 */
public interface ICourseContent {
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
}
