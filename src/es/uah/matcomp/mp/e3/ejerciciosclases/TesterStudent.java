package es.uah.matcomp.mp.e3.ejerciciosclases;

public class TesterStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Paula","Alcala", "tele", 23,233);
        s1.getProgram();
        s1.setProgram("te");
        s1.getYear();
        s1.setYear(2020);
        s1.getFee();
        s1.setFee(23);
    }
}
