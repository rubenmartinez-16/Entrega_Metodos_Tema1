package es.uah.matcomp.mp.e4.ejerciciosclases;

public class ResizableCircle extends Circle_65 implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }
    public String toString() {
        return "ResizableCircle["+super.toString()+"]";
    }
    @Override
    public void resize(int percent) {
        radius = radius * (percent/100.0);
    }

}
