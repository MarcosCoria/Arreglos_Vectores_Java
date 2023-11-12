/* Ejercicio_05: Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos. */
package java_extra_005;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_005 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas: ");
        int filas= leer.nextInt();
        while (filas<=0) {
            System.out.println("Error. Ingrese cantidad de filas: ");
            filas= leer.nextInt();
        }
        System.out.println("Ingrse la cantidad de columnas: ");
        int columnas= leer.nextInt();
        while (columnas<0) {
            System.out.println("Error. Ingrese cantidad de colummnas: ");
            columnas= leer.nextInt();
        }
        int matriz [][]= new int [filas][columnas]; // Le damos dimensión
        int sum= 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]= (int)(Math.random()*9) + 1; // Rango 0-8; le sumamos 1 y dá rango 1-9
                sum= sum+ matriz[i][j];
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("La suma de todos los elementos es: " + sum);
    }   
}