package com.chainOfResponsibility;

/**
 * @desc : 警告级别日志
 * @author: zhoushengwen
 * @date: 2020/9/2
 **/
public class WarnLogger extends AbstractLogger {

    public WarnLogger() {
        this.level = WARN;
    }

    @Override
    protected void write(String message) {
        System.out.println("warn logger:" + message);
    }
}
