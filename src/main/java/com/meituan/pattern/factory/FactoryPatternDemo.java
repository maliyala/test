package com.meituan.pattern.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //通过工厂得到Circle对象，并调用该对象的draw（）方法。
        Shape circle = shapeFactory.getShape("CIRCLE");
        //通过工厂得到Rectangle对象，并调用该对象的draw（）方法。
        circle.draw();
        Shape retangle = shapeFactory.getShape("RECTANGLE");
        retangle.draw();
        //通过工厂得到Square对象，并调用该对象的draw（）方法。
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
