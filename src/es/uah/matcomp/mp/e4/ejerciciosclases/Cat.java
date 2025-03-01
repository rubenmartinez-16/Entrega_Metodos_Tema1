package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Meow");
    }
}