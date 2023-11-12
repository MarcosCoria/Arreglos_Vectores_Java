/* Ejercicio_04: Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso. */
package java_extra_004;

import java.util.Scanner;

/*  @author G96xyFast */
public class Java_Extra_004 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de alumnos(deberían ser 10): ");
        int num = leer.nextInt();
        while (num<=0) {
            System.out.println("Error. Ingrese la cantidad de alumnos(deberían ser 10): ");
            num = leer.nextInt();
        }
        
        double matriz[][] = new double[num][5]; // 10 alumnos, 4 notas + un promedio general
        int contA = 0; // Contador aprobados
        int contD = 0; // Contador desaprobados
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese notas del alumno Nº" + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Nota 1º trabajo práctico(0-10): ");
                        matriz[i][j] = PedirNota();
                        break;
                    case 1:
                        System.out.println("Nota 2º trabajo práctico(0-10): ");
                        matriz[i][j] = PedirNota();
                        break;
                    case 2:
                        System.out.println("Nota 1º Integrador(0-10): ");
                        matriz[i][j] = PedirNota();
                        break;
                    case 3:
                        System.out.println("Nota 2º Integrador(0-10): ");
                        matriz[i][j] = PedirNota();
                        break;
                    case 4:
                        double aux1=0;
                        for (int k = 0; k < 4; k++) { // Rango 0-3 (Las 4 notas anteriores)
                            aux1= aux1+ matriz [i][k]; // Sumamos las 4 notas anteriores
                        }
                        double aux2=0; // Sumaremos las notas
                        for (int k = 0; k < 4; k++) { // Rango 0-3 (Las 4 notas anteriores)
                            switch (k) {
                                case 0:
                                    aux2= aux2+ matriz[i][k]*0.1;
                                    break;
                                case 1:
                                    aux2= aux2+ matriz[i][k]*0.15;
                                    break;
                                case 2:
                                    aux2= aux2+ matriz[i][k]*0.25;
                                    break;
                                case 3:
                                    aux2= aux2+ matriz[i][k]*0.5;
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        }
                        System.out.println("NOTA TOTAL: " + aux1);
                        System.out.println("PROMEDIO FINAL: " + aux2);
                        if (aux2 >= 7) {
                            contA++;
                        } else {
                            contD++;
                        }
                        // Guardamos el promedio final en la última posición del vector
                        matriz[i][j] = aux2;
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        }
        Resultados(matriz, contA, contD);
    }
    public static double PedirNota() {
        Scanner leer = new Scanner(System.in);
        double nota;
        nota = leer.nextDouble();
        while (nota< 0 || nota> 10) {
            System.out.println("Error. Intente nuevamente:");
            nota = leer.nextDouble();
        }
        return nota;
    }
    public static void Resultados(double matriz[][], int contA, int contD){
        System.out.println("\nRESULTADOS: ");
        System.out.println("Valores guardados en última posición: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Matriz[" + i + "]" + "[" + 4 + "]= " + matriz[i][4]);
        }
        System.out.println("La cantidad de aprobados: " + contA);
        System.out.println("La cantidad de desaprobados: " + contD);
    }
}
