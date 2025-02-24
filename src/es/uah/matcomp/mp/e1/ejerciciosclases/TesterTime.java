package es.uah.matcomp.mp.e1.ejerciciosclases;

public class TesterTime {
    public static void main(String[] args) {
// Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1); // toString()
        Time time1 = new Time(0, 0, 0);
        System.out.println("Esperado: 00:00:00, Obtenido: " + time1.toString());
        Time time2 = new Time(1, 2, 3);
        System.out.println("Esperado: 01:02:03, Obtenido: " + time2.toString());
        Time time3 = new Time(9, 10, 10);
        System.out.println("Esperado: 09:10:10, Obtenido: " + time3.toString());
        Time time4 = new Time(10, 9, 10);
        System.out.println("Esperado: 10:09:10, Obtenido: " + time4.toString());
        Time time5 = new Time(10, 10, 9);
        System.out.println("Esperado: 10:10:09, Obtenido: " + time5.toString());
        Time time6 = new Time(23, 59, 59);
        System.out.println("Esperado: 23:59:59, Obtenido: " + time6.toString());
        Time timeExtra = new Time(9, 10, 9);
        System.out.println("Esperado: 09:10:09, Obtenido: " + timeExtra.toString());
        Time timeExtra2 = new Time(10, 9, 9);
        System.out.println("Esperado: 10:09:09, Obtenido: " + timeExtra2.toString());
        Time timeExtra3 = new Time(9, 9, 10);
        System.out.println("Esperado:09:09:10, Obtenido: " + timeExtra3.toString());
// Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1); // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
// Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1); // toString()
// Test nextSecond();
        Time time7 = new Time(10, 10, 10);
        time7.nextSecond();
        System.out.println("Esperado: 10:10:11, Obtenido: " + time7.toString());
        Time time8 = new Time(10, 10, 59);
        time8.nextSecond();
        System.out.println("Esperado: 10:11:00, Obtenido: " + time8.toString());
        Time time9 = new Time(10, 59, 59);
        time9.nextSecond();
        System.out.println("Esperado: 11:00:00, Obtenido: " + time9.toString());
        Time time10 = new Time(23, 59, 59);
        time10.nextSecond();
        System.out.println("Esperado: 00:00:00, Obtenido: " + time10.toString());
// Test previousSecond()
        Time time11 = new Time(10, 10, 10);
        time11.previousSecond();
        System.out.println("Esperado: 10:10:09, Obtenido: " + time11.toString());
        Time time12 = new Time(10, 11, 0);
        time12.previousSecond();
        System.out.println("Esperado: 10:10:59, Obtenido: " + time12.toString());
        Time time13 = new Time(11, 0, 0);
        time13.previousSecond();
        System.out.println("Esperado: 10:59:59, Obtenido: " + time13.toString());
        Time time14 = new Time(0, 0, 0);
        time14.previousSecond();
        System.out.println("Esperado: 23:59:59, Obtenido: " + time14.toString());
    }
}
