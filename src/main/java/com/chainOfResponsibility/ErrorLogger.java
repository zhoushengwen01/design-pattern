package com.chainOfResponsibility;

/**
 * @desc : 信息基本日志
 * @author: zhoushengwen
 * @date: 2020/9/2
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger() {
        this.level = ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("error logger:" + message);
    }
}
