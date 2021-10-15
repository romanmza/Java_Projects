//Implemente la clase Persona. Una persona tiene un nombre y una fecha de
//nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
//siguientes métodos:
//Ejemplo Date como atributo: DateAtributo
//• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
//al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
//que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
//Tener en cuenta que para conocer la edad de la persona también se debe
//conocer la fecha actual.
//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
//otra edad y retorna true en caso de que el receptor tenga menor edad que la
//persona que se recibe como parámetro, o false en caso contrario.
//• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
package ejerciciopoo12;

import Servicios.ServicioPersona;
import java.util.Scanner;


public class EjercicioPOO12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioPersona servicio1 = new ServicioPersona();

        Persona p1 = servicio1.crearPersona();
        servicio1.calcularEdad(p1);
        System.out.println("Ingrese la edad en años de otra persona: ");
        if (servicio1.menorQue(leer.nextInt()) == true) {
            System.out.println("La edad ingresada es menor que la de " + p1.getNombre());
        } else {
            {
                System.out.println("La edad ingresada es mayor o igual que la de " + p1.getNombre());
            }
        }
        
        servicio1.mostrarPersona(p1);

    }

}
