/* Ejercicio_03: Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos). */
package java_003;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_003 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese largo del vector: ");
        int largo= leer.nextInt();
        while (largo<=0) {
            System.out.println("Error. Ingrese largo del vector: ");
            largo= leer.nextInt();
        }
        int [] vector= new int[largo]; // Le damos dimensión al vector
        for (int i = 0; i < vector.length; i++) {
            // Sumamos 1 para que el rango empiece en dicho número. El número más alto sería 99999(5 dígitos)
            vector[i]= (int)(Math.random()*99998) +1;
            String aux= String.valueOf(vector[i]); // Convertimos a String para calcular la cantidad de dígitos
            System.out.println("Vector [" + i + "]= " + vector[i] + ", dígitos: " + aux.length());
        }
    }   
}