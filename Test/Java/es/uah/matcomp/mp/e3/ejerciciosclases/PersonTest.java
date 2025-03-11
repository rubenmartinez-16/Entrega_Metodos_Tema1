package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person("John Doe", "123 Main St");


    @Test
    public void testGetName() {
        assertEquals("John Doe", person.getName());
    }

    @Test
    public void testGetAddress() {
        assertEquals("123 Main St", person.getAddress());
    }

    @Test
    public void testSetAddress() {
        person.setAddress("456 Elm St");
        assertEquals("456 Elm St", person.getAddress());
    }

    @Test
    public void testToString() {
        String expected = "Person [name=John Doe, address=123 Main St]";
        assertEquals(expected, person.toString());
    }
}