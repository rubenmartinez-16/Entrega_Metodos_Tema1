package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest extends CircleTest {
    Cylinder c1 = new Cylinder();
    Cylinder c2 = new Cylinder(2.0);
    Cylinder c3 = new Cylinder(3.0,2.0);
    Cylinder c4 = new Cylinder(4.0,3.0,"green");
    @Test
    void getHeight() {
        assertEquals(1.0,c2.getHeight());
    }

    @Test
    void setHeight() {
        c1.setHeight(5.0);
        assertEquals(5.0,c1.getHeight());
    }

    @Test
    void getVolume() {
        assertEquals((Math.PI*9.0)*2.0,c3.getVolume());
    }
}