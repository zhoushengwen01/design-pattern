package com.adapter;

/**
 * @desc : 视频媒体播放器
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public interface VideoMediaPlayer {

    void playVlc(String fileName);

    void playMp4(String fileName);
}

