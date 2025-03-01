package es.uah.matcomp.mp.e3.ejerciciosclases;

public class TesterPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Paula", "Alcala");
        p1.getName();
        p1.getAddress();
        p1.setAddress("Alcala");
    }
}
