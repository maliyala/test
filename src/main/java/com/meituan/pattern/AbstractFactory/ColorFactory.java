package com.meituan.pattern.AbstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        }
        if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        if(colorType.equalsIgnoreCase("BLuE")){
            return new Bule();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
