/* Ejercicio_01: Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario. */
package java_extra_001;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_001 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector: ");
        int num= leer.nextInt();
        while (num<=0) {
            System.out.println("Error. Ingrese tamaño del vector: ");
            num= leer.nextInt();
        }
        int sum=0;
        int [] vector= new int[num];
        System.out.println("Ingrese los valores del vector: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector[" + (i) + "]= ");
            vector[i]= leer.nextInt();
            sum= sum+ vector[i];
        }
        System.out.println("Vector ingresado: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("\nEl resultado de la suma de los elementos es: " + sum);
    }   
}