package com.meituan.pattern.factory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Cricle::draw().method.");
    }
}
