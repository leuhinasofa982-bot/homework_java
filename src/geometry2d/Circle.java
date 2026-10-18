package geometry2d;

import exceptions.InvalidParameterException;

public class Circle implements Figure{
    private static final double PI = 3.14159;
    private final double radius;


    public Circle(double radius){
        if(radius <= 0 || !Double.isFinite(radius)) {
            throw new InvalidParameterException("Радиус должен быть положительным конечным числом! Радиус: "
                    + radius);
        }
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public double area() {
        double circleArea = Math.pow(radius, 2) * PI;
        return circleArea;
    }
    @Override
    public double perimeter() {
        double circlePerimeter = 2 * PI * radius;
        return circlePerimeter;
    }
    @Override
    public String toString(){
        return "Circle {radius = " + getRadius()
                + ", area = " + area()
                + ", perimeter = " + perimeter();
    }
}
