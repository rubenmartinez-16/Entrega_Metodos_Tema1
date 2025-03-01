package es.uah.matcomp.mp.e4.ejerciciosclases;
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Woof");
    }

    // Sobrecarga del método greeting para otro perro
    public void greeting(Dog another) {
        System.out.println("Wooof");
    }
}