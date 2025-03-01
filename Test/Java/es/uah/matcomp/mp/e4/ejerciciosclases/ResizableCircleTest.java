package es.uah.matcomp.mp.e4.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {
    ResizableCircle resizableCircle = new ResizableCircle(6.0);

    @Test
    void testToString() {
        assertEquals("ResizableCircle[Circle[radius=6.0]]",resizableCircle.toString());
    }

    @Test
    void resize() {
        resizableCircle.resize(50);
        assertEquals("ResizableCircle[Circle[radius=3.0]]",resizableCircle.toString());
    }
}