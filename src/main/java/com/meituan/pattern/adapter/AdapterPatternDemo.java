package com.meituan.pattern.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("vlc","alone.vlc");
        audioPlayer.play("mp4","far far way.mp4");
        audioPlayer.play("avi","mind me.avi");
    }
}
