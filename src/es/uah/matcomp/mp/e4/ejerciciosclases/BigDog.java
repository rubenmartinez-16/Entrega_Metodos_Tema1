package es.uah.matcomp.mp.e4.ejerciciosclases;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Woow");
    }
    public void greeting(Dog another){
        System.out.println("Woooow");
    }
    public void greeting(BigDog another){
        System.out.println("Woooooow");
    }
}
