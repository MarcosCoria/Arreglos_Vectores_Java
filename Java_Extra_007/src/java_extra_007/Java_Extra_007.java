/* Ejercicio_07: Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
Si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor. */
package java_extra_007;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_007 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dígitos de la secuencia de Fibonacci: ");
        int num= leer.nextInt();
        while (num<=0) {
            System.out.println("Error. Ingrese la cantidad de dígitos de la secuencia de Fibonacci: ");
            num= leer.nextInt();
        }
        int vector []= new int[num]; // Le damos dimensión al vector
        int a=0;
        int b=1;
        for (int i = 0; i < vector.length; i++) {
            if (i==0) {
                vector[i]=b;
            } else {
                vector[i]=a+b;
                a=b;
                b=vector[i];
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector[" + (i+1) + "]= " + vector[i]);
        }
    }   
}