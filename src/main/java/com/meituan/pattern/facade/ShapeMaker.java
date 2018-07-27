package com.meituan.pattern.facade;

public class ShapeMaker {
    private Shape square;
    private Shape cricle;
    private Shape rectangle;

    public ShapeMaker() {
        square = new Square();
        cricle = new Cricle();
        rectangle = new Rectangle();
    }
    public void drawCricle(){
        cricle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
