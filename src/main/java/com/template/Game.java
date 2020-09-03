package com.template;

/**
 * @desc : 游戏抽象类
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public abstract class Game {

    abstract void initialize();//初始化

    abstract void startGame();//开始游戏

    abstract void endGame(); //结束游戏

    public final void play() {
        initialize();
        startGame();
        endGame();
    }

}
