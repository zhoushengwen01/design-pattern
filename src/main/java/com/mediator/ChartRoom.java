package com.mediator;

import java.util.Date;

/**
 * @desc : 聊天室内（作为中介者，群里发布消息）
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class ChartRoom {
    public static void sendMessage(User user, String message) {
        System.out.println(new Date().toString() + " " + user.getName() + " : " + message);
    }
}
