package com.meituan.pattern.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100, 0, 100);
        Shape greenCircle = new Circle(new GreenCircle(), 50, 50, 88);
        redCircle.draw();
        greenCircle.draw();
    }
}
