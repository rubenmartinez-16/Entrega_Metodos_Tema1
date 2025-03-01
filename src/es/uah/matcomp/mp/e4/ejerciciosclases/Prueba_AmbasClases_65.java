package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Prueba_AmbasClases_65 {
    public static void main(String[] args) {
        // Crear un círculo normal
        Circle_65 circle = new Circle_65(10);
        System.out.println(circle); // Circle[radius=10.0]
        System.out.println("Área: " + circle.getArea()); // 314.16...
        System.out.println("Perímetro: " + circle.getPerimeter()); // 62.83...

        // Crear un círculo redimensionable
        ResizableCircle resizableCircle = new ResizableCircle(10);
        System.out.println(resizableCircle); // ResizableCircle[radius=10.0]

        // Cambiar el tamaño del círculo al 50% de su tamaño actual
        resizableCircle.resize(50);
        System.out.println("Después de resize(50): " + resizableCircle); // ResizableCircle[radius=5.0]
        //Volver al anterior(100%)
        resizableCircle.resize(200);

        // Aumentar el tamaño original al 200%
        resizableCircle.resize(200);
        System.out.println("Después de resize(200): " + resizableCircle); // ResizableCircle[radius=10.]
    }

}
