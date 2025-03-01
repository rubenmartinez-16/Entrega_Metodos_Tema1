package es.uah.matcomp.mp.e4.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {
    Circle c1 = new Circle();
    Circle c2 = new Circle(5.0);
    Circle c3 = new Circle(6.3,"Blue",true);

    @Test
    void getRadius() {
        assertEquals(5.0, c2.getRadius());
    }

    @Test
    void setRadius() {
        c1.setRadius(5.0);
        assertEquals(5.0, c1.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(6.3*6.3*Math.PI, c3.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(5.0*2*Math.PI, c2.getPerimeter());
    }

    @Test
    void testToString() {
        assertEquals("Circle[Shape [color=Blue, filled=true],radius=6.3]",c3.toString());
    }
}