//Programa Nespresso. Desarrolle una clase Cafetera con los atributos
//capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
//cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
//menos, los siguientes métodos:
//• Constructor predeterminado o vacío
//• Constructor con la capacidad máxima y la cantidad actual
//• Métodos getters y setters.
//• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
package ejerciciopoo6;

import Servicios.ServicioCafetera;
import java.util.Scanner;

public class EjercicioPOO6 {

    public static void main(String[] args) {
        boolean salir = false;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Bienvenido a Nespresso");

        //creamos nuevo objeto de la clase de servicio
        ServicioCafetera servicio1 = new ServicioCafetera();
        

        //usamos el método de la clase de servicio que crea objetos de la clase Cafetera, e instanciamos cafetera1
        Cafetera cafetera1 = servicio1.NuevaCafetera();

        int menu = 0;

        do {
            System.out.println("Menú de Nespresso");
            System.out.println("Ingrese una de las opciones: ");
            System.out.println("1. Llenar Cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Café a la cafetera");
            System.out.println("5. Salir");
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    servicio1.LlenarCafetera(cafetera1);
                    break;
                case 2:
                    servicio1.ServirTaza(cafetera1);
                    break;
                case 3:
                    servicio1.VaciarCafetera(cafetera1);
                    break;
                case 4:
                    servicio1.AgregarCafe(cafetera1);
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta. Seleccione una de las opciones del menú");

            }

        } while (salir == false);

    }

}
