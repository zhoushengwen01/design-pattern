package com.chainOfResponsibility;

/**
 * @desc : 信息基本日志
 * @author: zhoushengwen
 * @date: 2020/9/2
 **/
public class InfoLogger extends AbstractLogger {

    public InfoLogger() {
        this.level = INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("info logger:" + message);
    }
}
