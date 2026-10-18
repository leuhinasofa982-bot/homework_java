package app;

import geometry2d.Circle;
import geometry2d.Figure;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

public class Main {
    public void main(){
        Figure myCircle = new Circle(5);
        Cylinder cyl = new Cylinder(myCircle, 10);
        System.out.println(cyl.toString());
    }
}