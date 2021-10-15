//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
//cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
//cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
//todas las familias.
package ejercicioextra13;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioExtra13 {

    public static void main(String[] args) {
        int n_fam;
        int max_hijos = 0;
      
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

       //2 System.out.println("Ingrese la cantidad de Familias: ");
        
        n_fam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Familias: "));
        
        // n_fam = leer.nextInt();

        int[] n_hijos = new int[n_fam];

        for (int i = 1; i <= n_fam; i++) {

            System.out.println("Ingrese la cantidad de hijos de la familia " + i);

            n_hijos[i - 1] = leer.nextInt();

            //averiguamos cuál es la familia con más hijos, de esta forma podemos conocer el valor maximo de dimensión de la matriz
            if (n_hijos[i - 1] > max_hijos) {
                max_hijos = n_hijos[i - 1];
            }

        }
        //creamos matriz de familias e hijos:
        int[][] edades = new int[n_fam][max_hijos];
        //rellenamos los valores de la matriz
        System.out.println("Ahora deberá ingresar las edades para cada hijo de cada familia");
        System.out.println("((se computarán sólo edades a partir de 1 año)");

        rell_manual(edades, n_fam, max_hijos, n_hijos);

        m_salida(edades, n_fam, max_hijos);
        p_calculo(edades, n_fam, max_hijos, n_hijos);

    }

    //Procedimiento que rellena una matriz dada en forma manual 
    public static void rell_manual(int[][] in_matriz, int in_fila, int in_columna, int[] in_n_hijos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //inicializamos la matriz con 0 para obtener las posiciones vacías
        for (int i = 0; i < in_fila; i++) {
            for (int j = 0; j < in_columna; j++) {

                in_matriz[i][j] = 0;
            }
        }
        //Vamos pidiendo las edades de cada hijo de cada familia, según la cantidad de hijos que antes ingresó para cada una:
        for (int i = 1; i <= in_fila; i++) {
            for (int j = 1; j <= in_n_hijos[i - 1]; j++) {
                System.out.println("Ingrese edad de hijo N° " + j + " de la familia N° " + i);                
                in_matriz[i - 1][j - 1] = leer.nextInt();

            }
        }
    }

    //Procedimiento que calcula promedio de edades de cada familia:
    public static void p_calculo(int[][] in_matriz, int in_fila, int in_columna, int[] in_n_hijos) {
        float promedio = 0;

        for (int i = 1; i <= in_fila; i++) {
            for (int j = 1; j <= in_n_hijos[i - 1]; j++) {

                promedio++;

            }
            promedio = promedio / in_n_hijos[i - 1];
            System.out.println("El promedio de edad de la familia " + i + "es: " + promedio);
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

}
