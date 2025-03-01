package es.uah.matcomp.mp.e4.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle = new Rectangle(5.0, 10.0, "blue", false);

@Test
void testDefaultConstructor() {
    Rectangle defaultRectangle = new Rectangle();
    assertEquals(1.0, defaultRectangle.getWidth());
    assertEquals(1.0, defaultRectangle.getLength());
    assertEquals("red", defaultRectangle.getColor());
    assertTrue(defaultRectangle.isFilled());
}

@Test
void testConstructorWithWidthAndLength() {
    Rectangle rect = new Rectangle(4.0, 8.0);
    assertEquals(4.0, rect.getWidth());
    assertEquals(8.0, rect.getLength());
    assertEquals("red", rect.getColor());
    assertTrue(rect.isFilled());
}

@Test
void testConstructorWithAllParameters() {
    assertEquals(5.0, rectangle.getWidth());
    assertEquals(10.0, rectangle.getLength());
    assertEquals("blue", rectangle.getColor());
    assertFalse(rectangle.isFilled());
}

@Test
void testSetWidth() {
    rectangle.setWidth(7.5);
    assertEquals(7.5, rectangle.getWidth());
}

@Test
void testSetLength() {
    rectangle.setLength(12.5);
    assertEquals(12.5, rectangle.getLength());
}

@Test
void testGetArea() {
    assertEquals(5.0 * 10.0, rectangle.getArea(), 0.0001);
}

@Test
void testGetPerimeter() {
    assertEquals(2 * (5.0 + 10.0), rectangle.getPerimeter(), 0.0001);
}

@Test
void testToString() {
    assertEquals("Rectangle[Shape [color=blue, filled=false],width=5.0, length=10.0]", rectangle.toString());
}
}