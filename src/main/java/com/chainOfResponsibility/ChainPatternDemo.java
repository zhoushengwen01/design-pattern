package com.chainOfResponsibility;

public class ChainPatternDemo {
    public static void main(String[] args) {
        AbstractLogger infoLogger = LoggerFactory.getInfoLogger();
        AbstractLogger warnLogger = LoggerFactory.getWarnLogger();
        AbstractLogger errorLogger = LoggerFactory.getErrorLogger();

        infoLogger.logMessage("信息级别日志");

        System.out.println("\n\n");
        warnLogger.logMessage("告警级别日志");

        System.out.println("\n\n");
        errorLogger.logMessage("错误级别日志");


    }
}
