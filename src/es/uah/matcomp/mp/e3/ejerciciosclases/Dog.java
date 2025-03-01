package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Wof");

    }
    public void greets(Dog another){
        System.out.println("Wooof");
    }
    @Override
    public String toString(){
        return "Dog["+ super.toString() + "]";
    }
}
