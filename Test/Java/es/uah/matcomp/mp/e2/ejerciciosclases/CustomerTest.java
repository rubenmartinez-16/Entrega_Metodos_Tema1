package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer c1 = new Customer(3020,"Pablo",20);

    @Test
    void getId() {
        assertEquals(3020,c1.getId());
    }

    @Test
    void getName() {
        assertEquals("Pablo",c1.getName());
    }

    @Test
    void getDiscount() {
        assertEquals(20,c1.getDiscount());
    }

    @Test
    void setDiscount() {
        c1.setDiscount(30);
        assertEquals(30,c1.getDiscount());
    }

    @Test
    void testToString() {
        assertEquals("Pablo(3020)(20%)",c1.toString());
    }
}