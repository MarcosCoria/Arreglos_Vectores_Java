/* Ejercicio_02: Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos). */
package java_extra_002;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_002 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de los vectores: ");
        int num= leer.nextInt();
        while (num<=0) {
            System.out.println("Error. Ingrese tamaño de los vectores: ");
            num= leer.nextInt();
        }
        System.out.print("Primer vector, ");
        int [] vector1= Llenar(num);
        System.out.print("Segundo vector, ");
        int [] vector2= Llenar(num);
        System.out.println("Primer vector ingresado: ");
        Mostrar(vector1);
        System.out.println("Segundo vector ingresado: ");
        Mostrar(vector2);
        Comprobar(vector1, vector2);
    }   
    public static int [] Llenar(int num){
        Scanner leer = new Scanner(System.in);
        int [] aux= new int [num];
        System.out.println("ingrese valores:");
        for (int i = 0; i < aux.length; i++) {
            aux[i]= leer.nextInt();
        }
        return aux;
    }
    public static void Mostrar(int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print( vector[i] + " ");
        }
        System.out.println("");
    }
    public static void Comprobar(int vector1 [], int vector2 []){
        boolean var= false;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i]!=vector2[i]) {
                var= true; // Si hay diferencias, devuelve true;
                break;
            }
        }
        if (var==false) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
}