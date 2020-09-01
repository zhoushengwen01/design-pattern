package com.singleton;


/**
 * @desc : 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class Mgr04 {

    private Mgr04() {
    }

    private static class Mgr07Holder {
        private final static Mgr04 INSTANCE = new Mgr04();
    }

    public static Mgr04 getInstance() {
        return Mgr07Holder.INSTANCE;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }


}
