package com.jack.java.day10;


import org.apache.log4j.Logger;

public class Log4jTester {
    public static Logger logger = Logger.getLogger(Log4jTester.class);
    public static void main(String[] arge) {
        test();
    }

    public static void test() {
        // 记录 debug 级别的日志
        logger.debug("这是我的 debug 级别的日志");
        // 记录 info 级别的日志
        logger.info("这是我的 info 级别的日志");
        // 记录 warn 级别的日志
        logger.warn("这是我的 warn 级别的日志");
        // 记录 error 级别的日志
        logger.error("这是我的 error 级别的日志");
    }
}
