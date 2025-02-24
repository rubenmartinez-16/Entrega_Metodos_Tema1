package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Cylinder_Redefined {
    private Circle b1 = new Circle();
    private double height;
    public Cylinder_Redefined(){
        this.height = 1.0;
    }
    public Cylinder_Redefined(double radius){
        this.b1.setRadius(radius);
        this.height = 1.0;
    }
    public Cylinder_Redefined(double radius, double height){
        this.b1.setRadius(radius);
        this.height = height;
    }
    public Cylinder_Redefined(double radius, double height,String color){
        this.b1.setRadius(radius);
        this.b1.setColor(color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return b1.getArea()*height;
    }
}
