package com.meituan.pattern.AbstractFactory;

public abstract class AbstractFactory {
    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);
}
