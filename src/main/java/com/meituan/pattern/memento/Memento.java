package com.meituan.pattern.memento;

public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
