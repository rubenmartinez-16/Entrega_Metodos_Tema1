package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Circle_Shape extends Shape {
    private double radius;

    public Circle_Shape(){
        super();
        this.radius = 1.0;

    }
    public Circle_Shape(double radius){
        super();
        this.radius = radius;
    }
    public Circle_Shape(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;

    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString(){

        return "Circle["+super.toString()+"] radius="+radius+"]";
    }

}
