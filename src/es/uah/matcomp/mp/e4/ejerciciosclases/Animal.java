package es.uah.matcomp.mp.e4.ejerciciosclases;
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void greeting();
}