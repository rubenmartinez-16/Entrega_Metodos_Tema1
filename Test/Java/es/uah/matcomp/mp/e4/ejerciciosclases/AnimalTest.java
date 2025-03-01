package es.uah.matcomp.mp.e4.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AnimalTest {
    @Test
    public void testGetName() {
        Animal animal = new Animal("Max") {
            @Override
            public void greeting() {
            }

        };
        BigDog d1 = new BigDog("Firulais");
        Dog d2 = new Dog("Otro_Firulais");
        BigDog d3 = new BigDog("Otro_Firulais_Grande");
        Dog d4 = new Dog("Otro_Firulais_Pequeño");
        d1.greeting();
        d1.greeting(d2);
        d1.greeting(d3);
        d2.greeting();
        d2.greeting(d4);
        Cat c1 = new Cat("Misi");
        c1.greeting();

        assertEquals("Max", animal.getName());
    }
}