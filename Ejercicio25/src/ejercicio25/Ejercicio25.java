//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
//muestre traspuesta
package ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        int dim = 4;
        int[][] matriz = new int[dim][dim];
        int[][] m_trans = new int[dim][dim];

        rell_aleatorio(matriz, dim,dim);

        System.out.println("Matriz Original:");

        m_salida(matriz, dim, dim);

        m_trans = f_transpuesta(matriz, dim, dim);
        System.out.println("Matriz transpuesta:");

        m_salida(m_trans, dim, dim);

    }

    //Procedimiento que rellena una matriz dada con valores aleatorios
    public static void rell_aleatorio(int[][] in_matriz, int in_fila, int in_columna) {

        for (int i = 0; i < in_fila; i++) {
            for (int j = 0; j < in_columna; j++) {
                in_matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    //Función que devuelve la matriz transpuesta
    public static int[][] f_transpuesta(int[][] in_matriz, int in_filas, int in_columnas) {
        int[][] out_salida = new int[in_columnas][in_filas];

        for (int i = 0; i < in_filas; i++) {
            for (int j = 0; j < in_columnas; j++) {
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
}
