package com.meituan.pattern.builder;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle!";
    }
}
