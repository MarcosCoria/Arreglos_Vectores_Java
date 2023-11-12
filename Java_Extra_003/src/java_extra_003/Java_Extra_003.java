/* Ejercicio_03: Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector. */
package java_extra_003;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_003 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dimensión del vector: ");
        int num= leer.nextInt();
        while (num<=0) {
            System.out.println("Error. Ingrese la dimensión del vector: ");
            num= leer.nextInt();
        }
        int vector []= new int [num];
        Llenar(vector);
    }   
    public static void Llenar(int vector []){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int)(Math.random()*9) +1;
        }
        Mostrar(vector);
    }
    public static void Mostrar(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector [" + i+ "]= "+ vector[i] + " ");
        }
    }
}