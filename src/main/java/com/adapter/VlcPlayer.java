package com.adapter;


public class VlcPlayer implements VideoMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        throw new UnsupportedOperationException();
    }
}

