/*
Diseñar un pseudocódigo que permita registrar ventas de forma aleatoria (10 - 5000) 
dentro de una matriz de 4x4. Visualizar la venta mayor y menor.
 */
package Programa;

import java.util.Random;
public class Tarea3 {
      public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[4][4];
        int VMayor = Integer.MIN_VALUE;
        int VMenor = Integer.MAX_VALUE;

        //  ventas en la matriz
        System.out.println("Matriz de Ventas Aleatorias:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                    ventas[i][j] = 10 + random.nextInt(4991);  // creara números entre 10 y 5000
                
                System.out.print(ventas[i][j] + "\t");

                //  venta mayor o menor
                if (ventas[i][j] > VMayor) {
                    VMayor = ventas[i][j];
                }
                if (ventas[i][j] < VMenor) {
                    VMenor = ventas[i][j];
                }
            }
            System.out.println();
        }

        // Salida de la venta mayor y menor
        System.out.println("\nLa venta mayor es: " + VMayor);
        System.out.println("La venta menor es: " + VMenor);
    }
}
