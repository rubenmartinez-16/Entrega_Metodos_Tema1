package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square sq= new Square();
    Square sq1= new Square(10);
    Square sq2= new Square(13.5,"Black",true);
    @Test
    void getSide() {
        assertEquals(1, sq.getSide());
    }

    @Test
    void setSide() {
        sq.setSide(11);
        assertEquals(11, sq.getSide());
    }

    @Test
    void testToString() {
        assertEquals("Square [ ShapeRectangle[Shape[Shape [color=Red, filled=true]width=1.0, length=1.0]]]", sq.toString());

    }

    @Test
    void setWidth() {
        sq1.setWidth(10);
        assertEquals(10, sq1.getWidth());
    }

    @Test
    void setLength() {
        sq1.setLength(10);
        assertEquals(10, sq1.getWidth());
    }
}