package es.uah.matcomp.mp.e2.ejerciciosclases;

public class MatrizMyPoint {
    public static void main(String[] args) {
        //Creo el array:
        MyPoint[] points = {new MyPoint(1, 1), new MyPoint(2, 2), new MyPoint(3, 3), new MyPoint(4, 4), new MyPoint(5, 5), new MyPoint(6, 6), new MyPoint(7, 7), new MyPoint(8, 8), new MyPoint(9, 9), new MyPoint(10, 10)};;
    //Vamos a crear la matriz, usando 2 bucles for anidados, donde el bucle con la variable i representa las filas y la j las columnas.
        double[][] matriz = new double[points.length][points.length];
        for (int i = 0; i < points.length ; i += 1){
            for (int j = 0; j < points.length ; j += 1){
                matriz[i][j] = points[i].distance(points[j]);
            }
        }
        //Salida:
        System.out.println("Matriz de distancias:");
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
        }


}
