package com.meituan.pattern.AbstractFactory;

public class Bule implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Bule::fill() method.");
    }
}
