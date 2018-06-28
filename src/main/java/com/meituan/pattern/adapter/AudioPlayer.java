package com.meituan.pattern.adapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        //播放MP3音乐文件
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ filename);
        }
        //mediaplayer提供了其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,filename);
        }else{
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
