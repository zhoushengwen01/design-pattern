package com.singleton;


/**
 * @desc : 加双重锁懒汉式
 * 通过synchronized解决线程不安全的问题，但也带来效率下降
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class Mgr03 {
    private static volatile Mgr03 INSTANCE;

    private Mgr03() {
    }

    public static Mgr03 getInstance() {
        if (INSTANCE == null) {
            //双重检查
            synchronized (Mgr03.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr03();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
