/* Ejercicio_06: Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9 */
package java_006;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_006 {
    public static void main(String[] args) {
        int [][] matriz;
        System.out.println("Ingrese los valores de la matriz: ");
        matriz= LlenadoManual();
        System.out.println("Matriz ingresada: ");
        Mostrar(matriz);
        Comprobar(matriz);
    }   
    public static int [][] LlenadoManual(){
        Scanner leer = new Scanner(System.in);
        int [][] aux= new int [3][3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Valores de la fila Nº" + (i+1) + ": ");
            for (int j = 0; j < 3; j++) {
                aux[i][j]= leer.nextInt();
            }
        }
        return aux;
    }
    public static void Mostrar(int matriz [][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void Comprobar(int matriz [][]){
        int cont;
        boolean var= false;
        int [] filas= SumasFilas(matriz);
        int [] columnas= SumasColumnas(matriz);
        cont= CompararFilasColumnas(filas, columnas);
        cont= cont+ CompararDiagonales(matriz);
        if (cont>0) {
            System.out.println("No es un cuadrado mágico");
        } else {
            System.out.println("Es un cuadrado mágico");
        }
    }
    public static int [] SumasFilas(int [][] matriz){
        int [] vectorF= new int[3]; // Vector para almacenar los resultados filas
        for (int i = 0; i < 3; i++) {
            int sum=0; // La sumatoria vuelve a valer 0
            for (int j = 0; j < 3; j++) {
                sum=sum+matriz[i][j]; // Suma una fila(I)
            }
            vectorF[i]= sum; //Almacena el resultado de una fila
        }
        return vectorF;
    }
    public static int [] SumasColumnas(int [][] matriz){
        int [] vectorC= new int [3]; // Vector para almacenar los resultados de las columnas
        for (int j = 0; j < 3; j++) {
            int sum=0; // La sumatoria vuelve a ser 0
            for (int i = 0; i < 3; i++) {
                sum= sum+ matriz[i][j]; //Suma una columna(J)
            }
            vectorC[j]= sum; // Almacena el resultado de una columna
        }
        return vectorC;
    }
    public static int CompararFilasColumnas(int [] filas, int [] columnas){
        int cont=0;
        // Si los vectores son diferentes el contador incrementa
        for (int i = 0; i < 3; i++) {
            if (filas[i]!=columnas[i]) {
                cont++;
            }
        }
        return cont;
    }
    public static int CompararDiagonales(int matriz[][]){
        int cont=0;
        int sum1=0;
        int sum2=0;
        int min=0;
        int max=2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j) {
                    sum1= sum1+ matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==min && j==max) {
                    sum2=sum2+ matriz[i][j];
                    min++;
                    max--;
                }
            }
        }
        if (sum1!=sum2) { // Si hay diferencias, aumenta el contador
            cont++;
        }  
        return cont;
    }
}