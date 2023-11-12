/* Ejercicio_06: Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random(). */
package java_extra_006;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_006 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Probar con 'char'
        String matriz[][] = new String[20][20];
        // Rellenar matriz
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = "º";
            }
        }

        int resultadosF[] = new int[5]; // Rango 0-4 (5 palabras)

        for (int i = 0; i < 5; i++) {
            resultadosF[i] = (-1); // Rellenamos con '-1'
        }

        boolean var;
        int azar;
        for (int i = 0; i < 5; i++) {
            do {
                var = false; // Reiniciamos falso
                azar = (int) (Math.random() * 20); // Rango 0-19
                for (int j = 0; j < 5; j++) { // Recorremos las 5 posiciones
                    if (resultadosF[j] == azar) {
                        var = true; // Detecta coincidencias
                    }
                }
            } while (var == true); // Si hay una sola coincidencia, repite
            // Si no hay coincidencias, asigna
            resultadosF[i]= azar;
        }

        System.out.println("Vector1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(resultadosF[i] + " ");
        }

        //--------------------------//
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la palabra Nº" + (i+1) + ": ");
            String palabra = leer.next();
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("Error. Ingrese la palabra Nº" + (i+1) + ": ");
                palabra = leer.next();
            }
            
            int fila = resultadosF[i]; // Le asignamos una de las posiciones del vector

            int columna; // Variable para indicar en qué columna comienza la palabra
            int aux = 0;
            switch (palabra.length()) {
                case 3:
                    columna = (int) (Math.random() * 18); // La posición máxima es 17-18-19
                    for (int j = columna; j < (columna + 3); j++) {
                        matriz[fila][j] = palabra.substring(aux, (aux + 1));
                        aux++; // Incrementa el auxiliar para leer el String
                    }
                    break;
                case 4:
                    columna = (int) (Math.random() * 17); // La posición máxima es 16-17-18-19
                    for (int j = columna; j < (columna + 4); j++) {
                        matriz[fila][j] = palabra.substring(aux, (aux + 1));
                        aux++; // Incrementa el auxiliar para leer el String
                    }
                    break;
                case 5:
                    columna = (int) (Math.random() * 16); // La posición máxima es 15-16-17-18-19
                    for (int j = columna; j < (columna + 5); j++) {
                        matriz[fila][j] = palabra.substring(aux, (aux + 1));
                        aux++; // Incrementa el auxiliar para leer el String
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println("Matriz obtenida: ");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
