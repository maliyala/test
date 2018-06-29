package com.meituan.pattern.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decorator) {
        super(decorator);
    }

    @Override
    public void draw() {
        decorator.draw();
        setRedBorder(decorator);
    }

    private void setRedBorder(Shape decorator) {
        System.out.println("Border Color :Red");
    }
}
