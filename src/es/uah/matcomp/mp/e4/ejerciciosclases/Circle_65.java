package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Circle_65 implements GeometricObject {
    double radius;

    public Circle_65(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
