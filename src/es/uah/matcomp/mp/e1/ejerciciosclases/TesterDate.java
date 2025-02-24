package es.uah.matcomp.mp.e1.ejerciciosclases;

public class TesterDate {
    public static void main(String[] args) {
// Test constructor and toString()
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1); // toString()
// Test Setters and Getters
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1); // toString()
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());
// Test setDate()
        d1.setDate(3, 4, 2016);
// toString()
        System.out.println(d1);
        Date d2 = new Date(9,10,1990);
        System.out.println(d2);
        Date d3 = new Date(10,2,2014);
        System.out.println(d3);
        Date d4 = new Date(9,12,1990);
        System.out.println(d4);
        Date d5 = new Date(10,10,1999);
        System.out.println(d5);
    }
}
