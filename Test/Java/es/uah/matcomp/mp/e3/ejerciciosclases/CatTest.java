package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CatTest extends MammalTest{
    Cat c1 = new Cat("Misi");
    @Test
    void testToString() {
        assertEquals("Cat[Mammal[Animal [nombre: Misi]]]",
                c1.toString());
        c1.greets();
    }
}