package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle base = new Circle(2.5);

    @Test
    void getRadius() {
        Circle circle = new Circle(2.3,"black");
        assertEquals(2.3, circle.getRadius());
    }

    @Test
    void setRadius() {
        Circle circle = new Circle(2.3);
        circle.setRadius(5);
        assertEquals(5, circle.getRadius());
    }

    @Test
    void getColor() {
        assertEquals("red", base.getColor());
    }

    @Test
    void setColor() {
        Circle circle = new Circle();
        circle.setColor("blue");
        assertEquals("blue", circle.getColor());
    }

    @Test
    void getArea() {
        assertEquals(Math.PI*2.5*2.5, base.getArea());
    }

    @Test
    void testToString() {
        assertEquals("Circle[radius=2.5,color=red]", base.toString());
    }
}