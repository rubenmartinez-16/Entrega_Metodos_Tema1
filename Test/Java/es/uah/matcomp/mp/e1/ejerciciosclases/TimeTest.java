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
    public void testToString() {
        assertEquals("00:00:00", new Time(0, 0, 0).toString());
        assertEquals("01:02:03", new Time(1, 2, 3).toString());
        assertEquals("10:10:10", new Time(10, 10, 10).toString());
        assertEquals("23:59:59", new Time(23, 59, 59).toString());
        assertEquals("12:30:45", new Time(12, 30, 45).toString());
        assertEquals("23:59:59", new Time(0, 0, 0).previousSecond().toString());
        assertEquals("12:30:29", new Time(12, 30, 30).previousSecond().toString());
        assertEquals("01:02:02", new Time(1, 2, 3).previousSecond().toString());
        assertEquals("10:10:09", new Time(10, 10, 10).previousSecond().toString());
        assertEquals("23:57:59", new Time(23, 58, 0).previousSecond().toString());
        assertEquals("00:00:58", new Time(0, 0, 59).previousSecond().toString());
        assertEquals("00:58:59", new Time(0, 59, 0).previousSecond().toString());
        assertEquals("12:59:59", new Time(13, 0, 0).previousSecond().toString());
        assertEquals("08:59:08", new Time(8, 59, 9).previousSecond().toString());
        assertEquals("10:09:08", new Time(10, 9, 9).previousSecond().toString());
        assertEquals("22:09:59", new Time(22, 9, 59).toString());

    }

    @Test
    public void nextSecond() {
        assertEquals("00:00:00", new Time(23, 59, 59).nextSecond().toString());
        assertEquals("12:30:31", new Time(12, 30, 30).nextSecond().toString());
        assertEquals("01:02:04", new Time(1, 2, 3).nextSecond().toString());
        assertEquals("10:10:11", new Time(10, 10, 10).nextSecond().toString());
        assertEquals("23:59:00", new Time(23, 58, 59).nextSecond().toString());
        assertEquals("23:00:00", new Time(22, 59, 59).nextSecond().toString());
    }

    @Test
    public void previousSecond() {
        assertEquals("23:59:59", new Time(0, 0, 0).previousSecond().toString());
        assertEquals("12:30:29", new Time(12, 30, 30).previousSecond().toString());
        assertEquals("01:02:02", new Time(1, 2, 3).previousSecond().toString());
        assertEquals("10:10:09", new Time(10, 10, 10).previousSecond().toString());
        assertEquals("23:57:59", new Time(23, 58,0).previousSecond().toString());
    }
}