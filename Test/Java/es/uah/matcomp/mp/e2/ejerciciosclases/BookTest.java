package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Author a2 = new Author("Miguel Delibes", "miguel@gmail.com");
    Book b1 = new Book("01012","La sombra del ciprés es alargada", a2, 35.9,5);
    Book b2 = new Book("01012","La sombra del ciprés es alargada", a2, 35.9);
    @Test
    void getIsbn() {
        assertEquals("01012",b1.getIsbn());
    }

    @Test
    void getName() {
        assertEquals("La sombra del ciprés es alargada",b1.getName());
    }

    @Test
    void getAuthor() {
        assertEquals(a2,b1.getAuthor());
        assertEquals(a2,b2.getAuthor());
    }

    @Test
    void getPrice() {
        assertEquals(35.9,b1.getPrice());
        assertEquals(35.9,b2.getPrice());

    }

    @Test
    void getQty() {
        assertEquals(5,b1.getQty());
    }

    @Test
    void setQty() {
        b1.setQty(7);
        assertEquals(7,b1.getQty());
    }

    @Test
    void setPrice() {
        b1.setPrice(38.7);
        b2.setPrice(40.7);
        assertEquals(38.7,b1.getPrice());
        assertEquals(40.7,b2.getPrice());

    }

    @Test
    void getAuthorName() {
        assertEquals("Miguel Delibes",b1.getAuthorName());
        assertEquals("Miguel Delibes",b2.getAuthorName());

    }

    @Test
    void testToString() {
        assertEquals("Book[ isbn = 01012, name = La sombra del ciprés es alargada,Author[name= Miguel Delibes, email= miguel@gmail.com], price = 35.9, qty = 5]",b1.toString());
        assertEquals("Book[ isbn = 01012, name = La sombra del ciprés es alargada,Author[name= Miguel Delibes, email= miguel@gmail.com], price = 35.9, qty = 0]",b2.toString());
    }
}