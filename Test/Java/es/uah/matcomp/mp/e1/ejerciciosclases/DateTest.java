package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    Date d1 = new Date(1, 2, 2014);
    @Test
    void getDay() {
        assertEquals(1, d1.getDay());

    }

    @Test
    void getMonth() {
        assertEquals(2, d1.getMonth());
    }

    @Test
    void getYear() {
        Date d1 = new Date(1, 2, 2014);
    }
    Date d2 = new Date(9,8 , 2029);
    @Test
    void setDay() {
        d2.setDay(5);
        assertEquals(5, d2.getDay());

    }

    @Test
    void setMonth() {
        d2.setMonth(3);
        assertEquals(3, d2.getMonth());
    }

    @Test
    void setYear() {
        d2.setYear(2019);
        assertEquals(2019, d2.getYear());
    }
    Date d3 = new Date(1, 2, 2014);
    @Test
    void setDate() {
        d3.setDate(3, 4, 2016);
        assertEquals(3,d3.getDay());
        assertEquals(4,d3.getMonth());
        assertEquals(2016,d3.getYear());
    }

    @Test
    void testToString() {
        assertEquals("01/02/2014", d1.toString());


    }
}