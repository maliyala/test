package com.meituan.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> lists = new ArrayList<>();

    public void add(Memento state){
        lists.add(state);
    }
    public Memento get(int index){
        return lists.get(index);
    }
}
