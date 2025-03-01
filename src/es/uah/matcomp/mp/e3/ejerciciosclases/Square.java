package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Square extends Rectangle {
    public Square() {
        super();

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();  // Usar getWidth() en lugar de 'side'
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);

    }

    @Override
    public String toString() {
        return "Square [ Shape" + super.toString() + "]";
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setWidth(side);
    }
}