package es.uah.matcomp.mp.e4.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    // Subclase concreta para pruebas
    class Circle_Prueba extends Shape {
        private double radius;

        public Circle_Prueba() {
            super();
            this.radius = 1.0;
        }
        public Circle_Prueba(double radius) {
            super();
            this.radius = radius;
        }

        public Circle_Prueba(String color, boolean filled, double radius) {
            super(color, filled);
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public class ShapeTest {

        Circle_Prueba circle = new Circle_Prueba("blue", false, 5.0);

        @Test
        void testDefaultConstructor() {
            Circle_Prueba defaultCircle = new Circle_Prueba();
            assertEquals("red", defaultCircle.getColor());
            assertTrue(defaultCircle.isFilled());
        }

        @Test
        void testParameterizedConstructor() {
            assertEquals("blue", circle.getColor());
            assertFalse(circle.isFilled());
        }

        @Test
        void testSetColor() {
            circle.setColor("green");
            assertEquals("green", circle.getColor());
        }

        @Test
        void testSetFilled() {
            circle.setFilled(true);
            assertTrue(circle.isFilled());
        }

        @Test
        void testToString() {
            assertEquals("Shape [color=blue, filled=false]", circle.toString());
        }

        @Test
        void testGetArea() {
            assertEquals(Math.PI * 5.0 * 5.0, circle.getArea());
        }

        @Test
        void testGetPerimeter() {
            assertEquals(2 * Math.PI * 5.0, circle.getPerimeter());
        }
    }
