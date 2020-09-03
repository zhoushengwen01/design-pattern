package com.chainOfResponsibility;

/**
 * @desc : 日志抽象类
 * @author: zhoushengwen
 * @date: 2020/9/2
 **/
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int WARN = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(message);
        }
    }

    abstract protected void write(String message);
}
