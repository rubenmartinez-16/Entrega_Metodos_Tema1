package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest{
    Animal a1 = new Animal ("Leon");

    @Test
    void testToString() {
        assertEquals("Animal [nombre: Leon]", a1.toString());
    }
    }

