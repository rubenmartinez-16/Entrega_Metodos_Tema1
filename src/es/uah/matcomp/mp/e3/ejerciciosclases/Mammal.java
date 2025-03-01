package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Mammal extends Animal{
    public Mammal(String nombre){
        super(nombre);

    }
    @Override
    public String toString(){
        return "Mammal["+ super.toString()+ "]";
    }
}
