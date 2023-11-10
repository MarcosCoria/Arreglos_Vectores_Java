/* Ejercicio_01: Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden DESCENDENTE. */
package java_001;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_001 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector= new int [100];
        int aux= vector.length;
        // Llenamos el vector y luego mostramos su contenido
        for (int i = 0; i<vector.length; i++) {
            vector[i]= (aux); // Llenar desde el valor más grande al menor
            aux--;
            System.out.println("Vector[" + i + "]= " + vector[i]); // Mostrar
        }     
    }   
}