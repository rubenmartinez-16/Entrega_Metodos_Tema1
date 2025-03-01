package es.uah.matcomp.mp.e4.ejerciciosclases;

class Circle_I implements GeometricObject {
    private double radius;

    public Circle_I(double radius) {
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

