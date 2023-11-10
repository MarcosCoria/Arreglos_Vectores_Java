/* Ejercicio_04: Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa) */
package java_004;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_004 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz1= new int [4][4]; // Matriz original
        Llenar(matriz1);
    }
    
    public static void Llenar(int matriz[][]){
        System.out.println("Matriz con Subprogramas: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= (int)(Math.random()*9)+1; // Rellenamos la matriz original
            }
        }
        Mostrar(matriz);
        Transpuesta(matriz);
    }
    public static void Mostrar(int matriz[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " "); // Imprimir un valor al lado del otro
            }
            System.out.println(""); // Salto de línea
        }
    }
    public static void Transpuesta(int matriz[][]){
        System.out.println("\nMatriz transpuesta: ");
        int aux[][]= new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                aux[j][i]= matriz[i][j];
            }
        }
        Mostrar(aux);
    }
}