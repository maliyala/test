package com.meituan.pattern.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape cricle = new Cricle();

        Shape redCricle = new RedShapeDecorator(new Cricle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        cricle.draw();

        System.out.println("\nCircle of red border");
        redCricle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
