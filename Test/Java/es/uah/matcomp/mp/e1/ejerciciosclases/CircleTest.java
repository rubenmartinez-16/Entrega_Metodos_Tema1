package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c1 = new Circle(1.1);
    Circle c2 = new Circle();
    @Test
    void getRadius() {
        assertEquals(1.1, c1.getRadius());


    }

    @Test
    void setRadius() {
        c2.setRadius(2.2);
        assertEquals(2.2, c2.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(3.8, c1.getArea()-0.0013271108436504);
    }

    @Test
    void getCircumference() {
        assertEquals(6.91, c1.getCircumference()-0.001503837897546);
    }

    @Test
    void testToString() {
        assertEquals("Circle[radius=1.1]", c1.toString());
    }
}