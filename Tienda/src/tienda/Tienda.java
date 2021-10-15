//a) Lista el nombre de todos los productos que hay en la tabla producto.
//b) Lista los nombres y los precios de todos los productos de la tabla producto.15
//c) Listar aquellos productos que su precio esté entre 120 y 202.
//d) Buscar y listar todos los Portátiles de la tabla producto.
//e) Listar el nombre y el precio del producto más barato.
//f) Ingresar un producto a la base de datos.
//g) Ingresar un fabricante a la base de datos
//h) Editar un producto con datos a elección
package tienda;

import java.util.Scanner;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

public class Tienda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        int opcion = 0;

        ProductoServicio p1 = new ProductoServicio();
        FabricanteServicio f1 = new FabricanteServicio();
        do {

            System.out.println("Menú Tienda");
            System.out.println("----------------------------");
            System.out.println("(1) Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("(2) Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("(3) Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("(4) Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("(5) Listar el nombre y el precio del producto más barato.");
            System.out.println("(6) Ingresar un producto a la base de datos.");
            System.out.println("(7) Ingresar un fabricante a la base de datos");
            System.out.println("(8) Editar un producto con datos a elección");
            System.out.println("(9) SALIR");
            System.out.println("Seleccione una de las opciones:");
            
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:

                        p1.Listar_Nombre_Productos();
                        break;
                        
                    case 2:
                        p1.Listar_NombrePrecio_Productos();
                        break;
                    case 3:
                        p1.Listar_Rango();
                        break;
                    case 4:
                        p1.Listar_Portatiles();
                        break;
                    case 5:
                        p1.Listar_ProductoMasBarato();
                        break;
                    case 6:
                        p1.Ingresar_producto();
                        break;
                    case 7:
                        f1.Agregar_Fabricante();
                        break;
                    case 8:
                        p1.Modificar_producto();
                        break;
                    case 9:
                        System.out.println("!!Hasta Luego!!");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");

                }
            } catch (Exception e) {
            }

        } while (salir==false);
    }

}
