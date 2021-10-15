//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
//el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
//horas
package ejercicioextra1;

import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el tiempo en minutos:");
        float minutos = leer.nextInt();

        float dias = minutos / 1440;
        float horas = (dias % 1) * 24;

        //dejamos sólo parte entera

        dias = dias - (dias % 1);
        horas = horas - (horas % 1);

        //mostramos salida sin decimales
        System.out.printf("Días: %.0f\n", dias);
        System.out.printf("Horas: %.0f\n", horas);

    }

}
