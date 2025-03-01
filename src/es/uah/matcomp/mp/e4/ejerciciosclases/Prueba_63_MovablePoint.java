package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Prueba_63_MovablePoint {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);

        System.out.println("Posicion inicial: " + point);

        point.moveRight();
        System.out.println("Posicion tras moverse a la derecha: " + point);

        point.moveUp();
        System.out.println("Posicion tras moverse hacia arriba: " + point);

        point.moveLeft();
        System.out.println("Posicion tras moverse a la izquierda: " + point);

        point.moveDown();
        System.out.println("Posicion tras moverse hacia abajo: " + point);
    }
    }

