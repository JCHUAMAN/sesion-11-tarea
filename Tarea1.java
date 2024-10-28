/*
Diseñar un pseudocódigo que permita registrar ventas dentro de una matriz de 4x4. 
Visualizar el total de las ventas.
*/
package Programa;
import java.util.Scanner;
public class Tarea1 {
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] ventas = new int[4][4];
        int totalV = 0;
        // Proceso
        System.out.println("Ingrese las ventas para cada posición de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ventas en [" + i + "][" + j + "]: ");
                ventas[i][j] = leer.nextInt();
                totalV += ventas[i][j];
            }
        }
        // matriz de las ventas
        System.out.println("\nMatriz de Ventas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }

        // Salida de datos
        System.out.println("\nEl total de las ventas es: " + totalV);
            }
}
