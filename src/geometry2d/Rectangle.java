package geometry2d;

import exceptions.InvalidParameterException;

public class Rectangle implements Figure{
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        if(length <= 0 || width <= 0 || !Double.isFinite(length) || !Double.isFinite(width)) {
            throw new InvalidParameterException("Стороны прямоугольника должны быть положительными конечными числами! Длина: "
                    + length + ", ширина: " + width);
        }
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    @Override
    public double area(){
        double rectArea = length * width;
        return rectArea;
    }
    @Override
    public double perimeter(){
        double rectPerimeter = 2 * length + 2 * width;
        return rectPerimeter;
    }
    @Override
    public String toString(){
        return "Rectangle {length = " + getLength()
                + ", width = " + getWidth()
                + ", area = " + area()
                + ", perimeter = " + perimeter();
    }
}
