package com.meituan.pattern.memento;

public class Memento {
    //状态
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

}
