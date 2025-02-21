package es.uah.matcomp.mp.e2.ejerciciosclases;

public class TesterMyPoint {
    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // which version?: Usa la distancia de un punto p1 de la clase MyPoint a otro de la misma clase (p2) introducido como parámetro.
        System.out.println(p2.distance(p1)); // which version?: Igual que el método susodicho, solo que ahora p2 pasa a ser el punto cuya distancia se calcula respecto de p1, que entra como parámetro.
        System.out.println(p1.distance(5, 6)); // which version? : Usa la distancia de un punto de la clase MyPoint(p1) a las coordenadas de un punto, las cuales entran como parámetro del método.
        System.out.println(p1.distance()); // which version? : Usa la distancia del punto de la clase MyPoint(p1) hasta el origen de coordenadas.
    }
}
