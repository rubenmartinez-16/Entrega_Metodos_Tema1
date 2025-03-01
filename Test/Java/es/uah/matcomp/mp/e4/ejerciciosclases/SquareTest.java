package es.uah.matcomp.mp.e4.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square = new Square(4.0, "green", true);

@Test
void testDefaultConstructor() {
    Square defaultSquare = new Square();
    assertEquals(1.0, defaultSquare.getSide()); // Hereda valores predeterminados de Rectangle
    assertEquals("red", defaultSquare.getColor());
    assertTrue(defaultSquare.isFilled());
}

@Test
void testConstructorWithSide() {
    Square squareWithSide = new Square(5.0);
    assertEquals(5.0, squareWithSide.getSide());
    assertEquals("red", squareWithSide.getColor());
    assertTrue(squareWithSide.isFilled());
}

@Test
void testConstructorWithSideColorFilled() {
    assertEquals(4.0, square.getSide());
    assertEquals("green", square.getColor());
    assertTrue(square.isFilled());
}

@Test
void testSetSide() {
    square.setSide(6.0);
    assertEquals(6.0, square.getSide());
}

@Test
void testSetWidth() {
    square.SetWidth(7.0);
    assertEquals(7.0, square.getSide()); // Debe cambiar ambos lados
}

@Test
void testSetLength() {
    square.SetLength(8.0);
    assertEquals(8.0, square.getSide()); // Debe cambiar ambos lados
}

@Test
void testGetArea() {
    assertEquals(4.0 * 4.0, square.getArea(), 0.0001);
}

@Test
void testGetPerimeter() {
    assertEquals(4 * 4.0, square.getPerimeter(), 0.0001);
}

@Test
void testToString() {
    assertEquals("Square [ ShapeRectangle[Shape [color=green, filled=true],width=4.0, length=4.0]]", square.toString());
}
}