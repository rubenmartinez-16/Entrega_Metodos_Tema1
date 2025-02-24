package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    Author a1 = new Author("Rubén","ruben@gmail.com");
    @Test
    void getName() {
        assertEquals("Rubén",a1.getName());
    }

    @Test
    void getEmail() {
        assertEquals("ruben@gmail.com",a1.getEmail());
    }

    @Test
    void setEmail() {
        a1.setEmail("Ruben@gmail.com");
        assertEquals("Ruben@gmail.com",a1.getEmail());

    }

    @Test
    void testToString() {
        assertEquals("Author[name= Rubén, email= ruben@gmail.com]",a1.toString());
    }
}