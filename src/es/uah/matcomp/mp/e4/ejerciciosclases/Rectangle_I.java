package es.uah.matcomp.mp.e4.ejerciciosclases;

class Rectangle_I implements GeometricObject {
    private double width;
    private double length;

    public Rectangle_I(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + "]";
    }
}

