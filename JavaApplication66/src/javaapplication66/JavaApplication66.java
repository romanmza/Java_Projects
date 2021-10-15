


package javaapplication66;

import java.util.Date;
import java.util.Scanner;


public class JavaApplication66 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int dia, mes , anio;
        System.out.println("Ingrese el día");
        dia=leer.nextInt();
        System.out.println("Ingrese un mes");
        mes=leer.nextInt()-1;
        System.out.println("Ingrese un anio");
        anio=leer.nextInt()-1980;
        Date fecha=new Date (dia, mes, anio);

    }

}
