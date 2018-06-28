package com.meituan.pattern.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi john!");
        john.sendMessage("Hello Robert!");
    }
}
