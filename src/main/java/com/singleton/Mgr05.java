package com.singleton;


/**
 * @desc : 枚举的方式实现
 * 不仅可以解决线程同步，还可以防止反序列化。
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public enum Mgr05 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr05.INSTANCE.hashCode());
            }).start();
        }
    }

}
