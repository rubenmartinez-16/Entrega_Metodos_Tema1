package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Prueba_6_2 {
    public static void main(String[] args) {
        GeometricObject circle = new Circle_I(5);
        GeometricObject rectangle = new Rectangle_I(4, 6);

        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println();

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());}

}

