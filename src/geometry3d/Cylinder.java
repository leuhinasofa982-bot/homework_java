package geometry3d;

import exceptions.InvalidParameterException;
import geometry2d.Figure;

public class Cylinder {
    private final Figure base;
    private final double height;

    public Cylinder(Figure base, double height){
        if(base == null || height <= 0 || !Double.isFinite(height)){
            throw new InvalidParameterException("Параметры цилиндра должны быть положительными конечными числами!");
        }
        this.base = base;
        this.height = height;
    }
    public Figure getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }

    public double volume() {
        double cylinderVolume = base.area() * height;
        return cylinderVolume;
    }

    @Override
    public String toString(){
        return "Cylinder {height = " + getHeight()
                + ", base area = " + getBase().area()
                + ", base perimeter = " + getBase().perimeter()
                + ", volume = " + volume();
    }
}
