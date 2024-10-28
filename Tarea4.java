/*
Diseñar un pseudocódigo que permita generar ventas aleatorias (1000-10000) y asignar 
los a una matriz de datos de 3 x 3. Visualizar el total y el promedio de las ventas.
 */
package Programa;
import java.util.Random;
public class Tarea4 {
     public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[3][3];
        int TVentas = 0;
        int CantVentas = 3 * 3; 

        // Proceso aleatoria de ventas en la matriz
        System.out.println("Matriz de Ventas Aleatorias:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = 1000 + random.nextInt(9001); 
                System.out.print(ventas[i][j] + "\t");
                TVentas += ventas[i][j];
            }
            System.out.println();
        }

        // promedio de las ventas
        double ProVentas = (double) TVentas / CantVentas;

        // Mostrar el total y el promedio de ventas
        System.out.println("\nEl total de las ventas es: " + TVentas);
        System.out.printf("El promedio de las ventas es: %.2f\n", ProVentas);
    }
}
