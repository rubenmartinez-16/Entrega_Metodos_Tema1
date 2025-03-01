package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest extends MammalTest {
    Dog d1 = new Dog("Rocky");
    @Test
    void testToString() {
        assertEquals("Dog[Mammal[Animal [nombre: Rocky]]]", d1.toString());
        d1.greets();
        Dog d2 = new Dog("RockyBalboa");
        d1.greets(d2);
    }
}