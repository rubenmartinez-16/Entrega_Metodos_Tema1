package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {
    InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
    @Test
    void getId() {
        assertEquals("A101", inv1.getId());

    }

    @Test
    void getDesc() {
        assertEquals("Pen Red", inv1.getDesc());
    }

    @Test
    void getQty() {
        assertEquals(888, inv1.getQty());
    }

    @Test
    void setQty() {
        inv1.setQty(898);
        assertEquals(898, inv1.getQty());
    }

    @Test
    void getUnitPrice() {
        assertEquals(0.08, inv1.getUnitPrice(), 0);
    }

    @Test
    void setUnitPrice() {
        inv1.setUnitPrice(0.8);
        assertEquals(0.8, inv1.getUnitPrice());
    }

    @Test
    void getTotal() {
        assertEquals(0.08 * 888, inv1.getTotal());

    }

    @Test
    void testToString() {
        assertEquals("InvoiceItem[ ID = A101, desc = Pen Red, qty = 888,unitPrice = 0.08 ]", inv1.toString());

    }
}