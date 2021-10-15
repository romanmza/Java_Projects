
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
//String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
//en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
//quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList


package ejerciciocollect_1_1_bis;

import ejerciciocollect_1_1_bis.servicios.ServicioPerro;
import java.util.ArrayList;
import java.util.Scanner;


public class EjercicioCollect_1_1_bis {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPerro servicio1 = new ServicioPerro();
        
        boolean salir = false;
        String option = "";
        do {
            System.out.println("Ingrese A para agregar una nueva raza o S para salir.");
            option = leer.next();
            if(option.equals("A"))
            {
                servicio1.agregarPerro();
            }
            else if (option.equals("S"))
            {
                salir = true;
            }
            else
            {
                System.out.println("Opción incorrecta.");
            }
                        
        } while (salir == false);
        
        servicio1.mostrarPerros();
       
    }
    
}
