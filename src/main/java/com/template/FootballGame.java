package com.template;

/**
 * @desc : 足球游戏
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class FootballGame extends Game {
    @Override
    void initialize() {
        System.out.println("足球游戏初始化");
    }

    @Override
    void startGame() {
        System.out.println("开始足球游戏");
    }

    @Override
    void endGame() {
        System.out.println("足球游戏结束");
    }
}
