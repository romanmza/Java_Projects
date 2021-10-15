//Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
//P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
//contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
//submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
//columnas, existe al menos una que coincida con la matriz P. En ese caso, el
//programa debe indicar la fila y la columna de la matriz M en la cual empieza el
//primer elemento de la submatriz P
package ejercicio28;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int fil_pos = 0;
        int col_pos = 0;

        int[][] mat_P = new int[3][3];
        int[][] mat_M = new int[10][10];

        rell_aleatorio(mat_M, 10, 10);
        System.out.println("Matriz M:");
        m_salida(mat_M, 10, 10);

        System.out.println("Ingrese datos para matriz P:");

        rell_manual(mat_P, 3, 3);
        m_salida(mat_P, 3, 3);
        
        if (f_cont_check(mat_M, 10, 10, mat_P, 3, 3, fil_pos, col_pos) == false) {

            System.out.println("La matriz P no se encuentra contenida en la matriz M");
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
                    if (valor >= 0 && valor < 10) {
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
        String pointer = null;

        for (int i = 0; i < in_fila; i++) {
            for (int j = 0; j < in_columna; j++) {
                System.out.print("[" + in_matriz[i][j] + "] ");
                if (j == in_columna - 1) {
                    System.out.println("");
                }
            }
        }
    }

    //Función que chequea si matriz P está contenida en matriz M
    public static boolean f_cont_check(int[][] in_mat_m, int in_fil_m, int in_col_m, int[][] in_mat_p, int in_fil_p, int in_col_p, int in_fil_pos, int in_col_pos) {
        boolean flag = false;

        for (int i = 0; i < in_fil_m - 2; i++) {
            if (flag == true) {
                break;
            }

            for (int j = 0; j < in_col_m - 2; j++) {
                flag = true;

                if (in_mat_m[i][j] == in_mat_p[0][0]) {
                    for (int m = 0; m < in_fil_p; m++) {
                        for (int n = 0; n < in_col_p; n++) {

                           // System.out.println("Mat_P (" + m + "," + n + "):" + in_mat_p[m][n]);
                           // System.out.println("Mat_M (" + m + i + "," + n + j + "):" + in_mat_m[m + i][n + j]);

                            if (in_mat_p[m][n] != in_mat_m[m + i][n + j]) {
                                flag = false;
                            }
                        }
                    }
                    if (flag == true) {
                        in_fil_pos = i;
                        in_col_pos = j;
                        System.out.println("Coincidencia encontrada");
                        System.out.println("La matriz M está contenida en la matriz P");
                        System.out.println("Posición de inicio: (" + in_fil_pos + "," + in_col_pos + ")");

                    }

                    
                } else {
                    flag = false;
                    
                }
                if (flag == true) {
                    break;
                }

            }
        }

        return flag;
    }
}
