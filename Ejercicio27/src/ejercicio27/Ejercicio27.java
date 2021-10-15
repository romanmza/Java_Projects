//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
//donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
//programa que permita introducir un cuadrado por teclado y determine si este
//cuadrado es mágico o no. El programa deberá comprobar que los números
//introducidos son correctos, es decir, están entre el 1 y el 9.
package ejercicio27;

import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int filas = 3;
        int columnas = 3;

        int[][] matriz = new int[filas][columnas];

        rell_manual(matriz, filas, columnas);

        //rell_aleatorio(matriz, filas,columnas);
        System.out.println("Matriz Original:");
        m_salida(matriz, filas, columnas);

        if (f_magic_check(matriz, filas, columnas) == true) {
            System.out.println("La matriz ingresada es mágica");
        } else {
            System.out.println("La matriz ingresada no es mágica");
        }
    }

    //Procedimiento que rellena una matriz dada con valores aleatorios
    public static void rell_aleatorio(int[][] in_matriz, int in_fila, int in_columna) {

        for (int i = 0; i < in_fila; i++) {
            for (int j = 0; j < in_columna; j++) {
                in_matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    //Procedimiento que rellena una matriz dada en forma manual con check del 0 al 9
    public static void rell_manual(int[][] in_matriz, int in_fila, int in_columna) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int valor = 0;
        boolean check = false;

        for (int i = 0; i < in_fila; i++) {
            for (int j = 0; j < in_columna; j++) {
                System.out.println("Ingrese elemento (" + i + "," + j + "): ");

                do {
                    valor = leer.nextInt();
                    if (valor > 0 && valor < 10) {
                        in_matriz[i][j] = valor;
                        check = true;
                    } else {
                        System.out.println("Valor incorrecto. Ingrese un número entero del 1 al 9 (incluidos)");
                        check = false;
                    }

                } while (check == false);
            }
        }
    }

    //Procedimiento que muestra matriz de salida:
    public static void m_salida(int[][] in_matriz, int in_fila, int in_columna) {

        for (int i = 0; i < in_fila; i++) {
            for (int j = 0; j < in_columna; j++) {
                System.out.print("[" + in_matriz[i][j] + "] ");
                if (j == in_columna - 1) {
                    System.out.println("");
                }
            }
        }
    }

    //Función que chequea matriz mágica
    public static boolean f_magic_check(int[][] in_matriz, int in_fila, int in_columna) {
        boolean out_salida = true;
        int suma_col = 0;
        int suma_fil = 0;
        int suma_diag1 = 0;
        int suma_diag2 = 0;

        for (int i = 0; i < in_fila; i++) {
            suma_fil = 0;
            suma_col = 0;

            for (int j = 0; j < in_columna; j++) {

                suma_fil = suma_fil + in_matriz[i][j];
                suma_col = suma_col + in_matriz[j][i];

                if (j == i) {
                    suma_diag1 = suma_diag1 + in_matriz[i][j];
                }
                if (j + i == in_fila - 1) {
                    suma_diag2 = suma_diag2 + in_matriz[i][j];
                }

            }
        }
        if (suma_fil != 15 || suma_col != 15 || suma_diag1 != 15 || suma_diag2 != 15) {
            out_salida = false;
        }
//        System.out.println("Filas: " + suma_fil);
//        System.out.println("Columnas: " + suma_col);
//        System.out.println("Diag ppal: " + suma_diag1);
//        System.out.println("Diag secundaria: " + suma_diag2);
        return out_salida;
    }
}
