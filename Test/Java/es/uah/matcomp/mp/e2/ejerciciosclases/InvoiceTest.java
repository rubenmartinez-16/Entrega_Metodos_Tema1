package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Customer c1 = new Customer(3020,"Pablo",20);
    Invoice i1 = new Invoice(350,c1,24.7);

    @Test
    void getId() {
        assertEquals(350,i1.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(c1,i1.getCustomer());
    }

    @Test
    void setCustomer() {
        Customer c2 = new Customer(2305,"Juan",30);
        i1.setCustomer(c2);
        assertEquals(c2,i1.getCustomer());
    }

    @Test
    void getAmount() {
        assertEquals(24.7,i1.getAmount());
    }

    @Test
    void setAmount() {
        i1.setAmount(35);
        assertEquals(35,i1.getAmount());
    }

    @Test
    void getCustomerId() {
        assertEquals(3020,i1.getCustomerId());
    }

    @Test
    void getCustomerName() {
        assertEquals(i1.getCustomer().getName(),i1.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        assertEquals(20,i1.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        assertEquals((i1.getAmount()- (i1.getAmount()*i1.getCustomerDiscount())/100),i1.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        assertEquals("Invoice[id=350,customer = Pablo(3020)(20%),amount = 24.7]",i1.toString());
    }
}