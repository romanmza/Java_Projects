//Se necesita una aplicación para una tienda en la cual queremos almacenar los
//distintos productos que venderemos y el precio que tendrán. Además, se necesita
//que la aplicación cuente con las funciones básicas.
//Estas las realizaremos en el main. Como, introducir un elemento, modificar su
//precio, eliminar un producto y mostrar los productos que tenemos con su precio
//(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
//el precio. Realizar un menú para lograr todas las acciones previamente
//mencionadas.
package ejerciciocollect_6;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioCollect_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        HashMap<String, Double> inventario = new HashMap();
        boolean salir = false;
        int opcion = 0;
        String nombre;
        double precio;

        do {
            System.out.println("-------------------------------------------------------");
            System.out.println("Menu de Inentario");
            System.out.println("=======================================================");
            System.out.println("Opciones del menú:");
            System.out.println("[1] Agregar un elemento nuevo al inventario");
            System.out.println("[2] Modificar precio del elemento");
            System.out.println("[3] Eliminar un elemento del inventario");
            System.out.println("[4] Mostrar inventario completo");
            System.out.println("[5] Salir");
            System.out.println("-------------------------------------------------------");

            try {

                opcion = leer.nextInt();
            } catch (Exception e) {
                //System.out.println("Valor inválido. Ingrese un número de la lista");
                leer.next();

            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre del producto a agregar:");
                    nombre = leer.next();
                    System.out.println("Ahora ingrese el precio del producto:");
                    precio = leer.nextDouble();
                    inventario.put(nombre, precio);
                    System.out.println("Elemento agregado al inventario");
                    break;
                case 2:
                    System.out.println("Ingrese producto a modificar precio:");
                    nombre = leer.next();

                    for (String index : inventario.keySet()) {

                        if (index.equals(nombre)) {
                            System.out.println("Ingrese nuevo precio para el producto:");
                            precio = leer.nextDouble();
                            inventario.put(index, precio);
                        } else {
                            System.out.println("El producto indicado no se encuentra en la lista");
                            break;
                        }

                    }
                    break;
                case 3:
                    System.out.println("Ingrese nombre del producto a eliminar:");
                    nombre = leer.next();
                    for (String index : inventario.keySet()) {
                        if (index.equals(nombre)) {

                            inventario.remove(nombre);
                            System.out.println("Elemento eliminado de la lista.");
                        } else {
                            System.out.println("El producto indicado no se encuentra en la lista");
                            break;
                        }
                    }

                    break;

                case 4:
                    System.out.println("LISTA DE INVENTARIO");
                    System.out.println("========================================================");
                    for (HashMap.Entry<String, Double> entry : inventario.entrySet()) {
                        System.out.println("[Nombre= " + entry.getKey() + ", Precio= " + entry.getValue() + "$]");
                    }
                    System.out.println("========================================================");
                    break;

                case 5:

                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("La opción ingresada no es válida.");
                    break;

            }
        } while (salir == false);

    }

}
