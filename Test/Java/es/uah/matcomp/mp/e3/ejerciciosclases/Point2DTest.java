package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    Point2D point = new Point2D();

@Test
public void testDefaultConstructor() {
    assertEquals(0, point.getX(), 0.0001);
    assertEquals(0, point.getY(), 0.0001);
}

@Test
public void testParameterizedConstructor() {
    point = new Point2D(2.5f, 3.5f);
    assertEquals(2.5f, point.getX(), 0.0001);
    assertEquals(3.5f, point.getY(), 0.0001);
}

@Test
public void testSetX() {
    point.setX(4.0f);
    assertEquals(4.0f, point.getX(), 0.0001);
}

@Test
public void testSetY() {
    point.setY(5.0f);
    assertEquals(5.0f, point.getY(), 0.0001);
}

@Test
public void testSetXY() {
    point.setXY(6.0f, 7.0f);
    assertEquals(6.0f, point.getX(), 0.0001);
    assertEquals(7.0f, point.getY(), 0.0001);
}

@Test
public void testGetXY() {
    point.setXY(8.0f, 9.0f);
    float[] coords = point.getXY();
    assertEquals(8.0f, coords[0], 0.0001);
    assertEquals(9.0f, coords[1], 0.0001);
}

@Test
public void testToString() {
    point.setXY(10.0f, 11.0f);
    assertEquals("(10.0,11.0)", point.toString());
    }
}