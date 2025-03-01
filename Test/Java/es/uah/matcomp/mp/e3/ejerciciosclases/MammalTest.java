package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MammalTest extends AnimalTest{
    Mammal m1 = new Mammal("Jirafa");
    @Test
    void testToString() {
        assertEquals("Mammal[Animal [nombre: Jirafa]]", m1.toString());
    }
}