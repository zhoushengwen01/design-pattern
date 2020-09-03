package com.chainOfResponsibility;


public class LoggerFactory {

    private final static InfoLogger infoLogger;
    private final static ErrorLogger errorLogger;
    private final static WarnLogger warnLogger;

    static {
        infoLogger = new InfoLogger();
        warnLogger = new WarnLogger();
        errorLogger = new ErrorLogger();

        warnLogger.setNextLogger(infoLogger);
        errorLogger.setNextLogger(warnLogger);
    }


    public static AbstractLogger getInfoLogger() {
        return infoLogger;
    }

    public static AbstractLogger getErrorLogger() {
        return errorLogger;
    }

    public static AbstractLogger getWarnLogger() {
        return warnLogger;
    }
}
