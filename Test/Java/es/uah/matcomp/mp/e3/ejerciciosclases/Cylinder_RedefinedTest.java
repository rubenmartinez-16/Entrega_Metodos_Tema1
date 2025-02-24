package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Cylinder_RedefinedTest{
    Cylinder_Redefined cy1 = new Cylinder_Redefined();
    Cylinder_Redefined cy2 = new Cylinder_Redefined(2.3);
    Cylinder_Redefined cy3 = new Cylinder_Redefined(2.7,5.0);
    Cylinder_Redefined cy4 = new Cylinder_Redefined(2.3,5.0,"blue");
    @Test
    void getHeight() {
        assertEquals(1.0, cy2.getHeight());
    }

    @Test
    void setHeight() {
        cy4.setHeight(2.5);
        assertEquals(2.5, cy4.getHeight());
    }

    @Test
    void getVolume() {
        assertEquals(5.0*2.7*2.7*Math.PI, cy3.getVolume());
    }
}