package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Prueba_64 {
    //Prueba de MovablePoint
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

        //Prueba de MOvableCircle
        MovableCircle circle = new MovableCircle(3,5,1,2,7);
        System.out.println("Posicion inicial: " + circle);

        circle.moveRight();
        System.out.println("Posicion tras moverse a la derecha: " + circle);

        circle.moveUp();
        System.out.println("Posicion tras moverse hacia arriba: " + circle);

        circle.moveLeft();
        System.out.println("Posicion tras moverse a la izquierda: " + circle);

        circle.moveDown();
        System.out.println("Posicion tras moverse hacia abajo: " + circle);
    }



}
