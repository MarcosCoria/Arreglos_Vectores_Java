/* Ejercicio_05: Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa). */
package java_005;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_005 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz1;
//        matriz1 = Llenar();
        matriz1= LlenadoManual();
        System.out.println("Primer Matriz: ");
        Mostrar(matriz1);
        int[][] matriz2;
        matriz2 = LlenadoManual();
        System.out.println("Segunda Matriz: ");
        Mostrar(matriz2);
        Comprobar(matriz1, matriz2);
    }

    public static int[][] Llenar() {
        int aux[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
        return aux;
    }

    public static void Mostrar(int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " "); // Mostrar valores uno al lado del otro
            }
            System.out.println(""); // Salto de línea
        }
    }

    public static int[][] LlenadoManual() {
        int aux[][] = new int[3][3];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valores de la segunda matriz: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Fila Nº" + (i + 1));
            for (int j = 0; j < 3; j++) {
                aux[i][j] = leer.nextInt();
            }
        }
        return aux;
    }

    public static void Comprobar(int matriz1[][], int matriz2[][]) {
        int [][] aux= new int [3][3];
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux[j][i]= matriz1[i][j]; // Hacemos la transpuesta negativa
            }
        }
        System.out.println("Auxiliar: ");
        Mostrar(aux);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (aux[i][j]!= matriz2[i][j]) {
                    cont++;
                }
            }
        }
        if (cont==0) {
            System.out.println("La segunda matriz es antisimétrica");
        } else {
            System.out.println("La segunda matriz no es antisimétrica");
        }
    }
}
