package com.proxy;

/**
 * @desc : 代理图片
 * @author: zhoushengwen
 * @date: 2020/9/1
 **/
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void diaplay() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.diaplay();
    }
}

