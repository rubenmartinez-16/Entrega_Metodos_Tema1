package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Circle extends Shape {
    double radius;
    public Circle() {
        this.radius = 1.0;
        super.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        super.color = "red";
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        super.color = color;
        super.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle["+super.toString()+",radius=" + radius +"]";
    }

}
