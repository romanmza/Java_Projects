//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
//la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
//clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
//pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
//de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
//fecha actual, que se puede conseguir instanciando un objeto Date con constructor
//vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();


package ejerciciopoo11;

import java.util.Date;
import java.util.Scanner;


public class EjercicioPOO11 {


    public static void main(String[] args) {
        
        int anio, mes, dia;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese año: ");
        anio=leer.nextInt()-1900;
        System.out.println("Ahora ingrese mes: ");
        mes=leer.nextInt()-1;
        System.out.println("Ahora ingrese día: ");
        dia=leer.nextInt();
        
        Date fecha = new Date(anio,mes,dia);
     //   System.out.println("Fecha actual: 30 /07 / 2021 ");
        
        
        Date actual = new Date();
        System.out.println(actual.toString());
        System.out.println(fecha.toString());
        
        long diferencia = fecha.getTime()- actual.getTime();
        
        diferencia = Math.abs((diferencia/1000)/86400);
        System.out.println("La diferencia entre la fecha ingresada y la fecha actual es de "+diferencia + " dias");
        
        

    }

}
