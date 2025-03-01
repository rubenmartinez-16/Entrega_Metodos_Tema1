package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r1 = new Rectangle(3.5F, 2.0F);
    Rectangle r2 = new Rectangle();

    @Test
    void getAltura() {
        assertEquals(3.5F, r1.getAltura(), "La altura del rectangulo es de 3.5");
    }

    @Test
    void setAltura() {
        r1.setAltura(5.0F);
        assertEquals(5.0F,r1.getAltura(), "La nueva altura del rectangulo es de 5.0");
    }

    @Test
    void getAnchura() {
        assertEquals(2.0F,r1.getAnchura(), "La anchura del rectangulo es de 2.5");
    }

    @Test
    void setAnchura() {
        r1.setAnchura(5.6F);
        assertEquals(5.6F,r1.getAnchura(),"La nueva anchura del rectangulo es de 5.6");
    }

    @Test
    void getArea() {
        assertEquals((3.5F * 2.0F),r1.getArea());
    }

    @Test
    void getPerimetro() {
        assertEquals((3.5F*2 +  2.0F*2),r1.getPerimetro());
    }

    @Test
    void testToString() {
        assertEquals("Rectangulo[Altura = 3.5, Anchura = 2.0 ]",r1.toString());
    }
}