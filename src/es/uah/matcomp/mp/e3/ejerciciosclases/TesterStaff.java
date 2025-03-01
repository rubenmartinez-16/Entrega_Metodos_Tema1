package es.uah.matcomp.mp.e3.ejerciciosclases;

public class TesterStaff {
    public static void main(String[] args) {
        Staff s1 = new Staff("Paula", "Alcala", "Calasanz",200);
        System.out.println(s1);
        s1.getSchool();
        s1.setSchool("Alkala Na'har");
        s1.getPay();
        s1.setPay(200);

    }
}
