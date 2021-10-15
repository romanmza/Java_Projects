//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
//que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
//cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
//una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
//viceversa)
package ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese N° de filas de la matriz: ");
        int filas = leer.nextInt();

        System.out.println("Ingrese N° de columnas de la matriz: ");
        int columnas = leer.nextInt();

        int[][] matriz = new int[filas][columnas];
        int[][] m_trans = new int[columnas][filas];

        rell_manual(matriz, filas, columnas);

        //rell_aleatorio(matriz, filas,columnas);
        System.out.println("Matriz Original:");
        m_salida(matriz, filas, columnas);

        m_trans = f_transpuesta(matriz, filas, columnas);

        System.out.println("Matriz transpuesta:");
        m_salida(m_trans, columnas, filas);

        if (f_AT_check(matriz, m_trans, filas, columnas) == true) {
            System.out.println("La matriz ingresada es antisimétrica");
        } else {
            System.out.println("La matriz ingresada no es antisimétrica");
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

    //Procedimiento que rellena una matriz dada en forma manual
    public static void rell_manual(int[][] in_matriz, int in_fila, int in_columna) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        for (int i = 0; i < in_fila; i++) {
            for (int j = 0; j < in_columna; j++) {
                System.out.println("Ingrese elemento (" + i + "," + j + "): ");
                in_matriz[i][j] = leer.nextInt();
            }
        }
    }

    //Función que devuelve la matriz transpuesta
    public static int[][] f_transpuesta(int[][] in_matriz, int in_fila, int in_columna) {
        int[][] out_salida = new int[in_columna][in_fila];

        for (int i = 0; i < in_fila; i++) {
            for (int j = 0; j < in_columna; j++) {
                out_salida[j][i] = in_matriz[i][j];
            }
        }
        return out_salida;
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

    //Función que chequea matriz antisimétrica
    public static boolean f_AT_check(int[][] in_matriz, int[][] in_m_transpuesta, int in_fila, int in_columna) {
        boolean out_salida = true;

        for (int i = 0; i < in_fila; i++) {
            for (int j = 0; j < in_columna; j++) {

                if (in_m_transpuesta[i][j] != -(in_matriz[i][j])) {
                    out_salida = false;
                }
            }
        }
        return out_salida;
    }
}
