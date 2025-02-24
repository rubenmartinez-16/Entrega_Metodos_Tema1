package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {
    MyPoint V1 = new MyPoint(0, 0);
    MyPoint V2 = new MyPoint(2, 3);
    MyPoint V3 = new MyPoint(4, 0);
    MyTriangle T1 = new MyTriangle(V1, V2, V3);

    @Test
    void testToString() {
        assertEquals("MyTriangle[ v1 = (0,0), v2 = (2,3), v3 = (4,0)]", T1.toString());
    }

    @Test
    void getPerimeter() {
        assertEquals((4+2*Math.sqrt(13)), T1.getPerimeter());
    }

    @Test
    void getType() {
        MyTriangle T2 = new MyTriangle(0,0,0,0,0,0);
        MyTriangle T3 = new MyTriangle(2,0,5,0,0,1);
        assertEquals("Isosceles", T1.getType());
        assertEquals("Equilatero", T2.getType());
        assertEquals("Escaleno", T3.getType());
    }
}