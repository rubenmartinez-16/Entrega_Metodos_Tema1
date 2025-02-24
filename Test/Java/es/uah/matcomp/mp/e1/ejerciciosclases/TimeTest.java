package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    Time t1 = new Time(22,37,58);

    @Test
    void getHour() {
        assertEquals(22,t1.getHour(), "La hora debe ser 22");
    }

    @Test
    void getMinute() {
        assertEquals(37,t1.getMinute(), "Los minutos deben ser 37");
    }

    @Test
    void getSecond() {
        assertEquals(58,t1.getSecond(), "Los segundos deben ser 58");
    }

    @Test
    void setTime() {
        t1.setTime(5,9,1);
        assertEquals(5, t1.getHour(),"La hora debe ser 5");
        assertEquals(9, t1.getMinute(),"Los minutos deben ser 9");
        assertEquals(1,t1.getSecond(),"Los segundos deben ser 1");
    }

    @Test
    void setHour() {
        t1.setHour(2);
        assertEquals(2, t1.getHour(), "La hora debe ser 2");
    }

    @Test
    void setMinute() {
        t1.setMinute(59);
        assertEquals(59, t1.getMinute(), "Los minutos deben ser 59");
    }

    @Test
    void setSecond() {
        t1.setSecond(59);
        assertEquals(59, t1.getSecond(), "Los segundos deben ser 59");
    }

    @Test
    void testToString() {
        Time time = new Time(0, 0, 0);
        assertEquals("00:00:00", time.toString());
        Time time2 = new Time(1, 2, 3);
        assertEquals("01:02:03", time2.toString());
        Time time3 = new Time(9, 10, 10);
        assertEquals("09:10:10", time3.toString());
        Time time4 = new Time(10, 9, 10);
        assertEquals("10:09:10", time4.toString());
        Time time5 = new Time(10, 10, 9);
        assertEquals("10:10:09", time5.toString());
        Time time6 = new Time(23, 59, 59);
        assertEquals("23:59:59", time6.toString());
    }

    @Test
    void nextSecond() {
        t1.setHour(2);
        t1.setMinute(59);
        t1.setSecond(59);
        t1.nextSecond();
        assertEquals("03:00:00",t1.toString());
    }

    @Test
    void previousSecond() {
        t1.setTime(0,0,0);
        assertEquals("23:59:59",t1.previousSecond().toString());
    }
}