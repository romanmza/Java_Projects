package tienda.servicios;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import tienda.persistencia.ProductoDAO;
import tienda.entidades.Producto;

public class ProductoServicio {

    private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }
//Lista el nombre de todos los productos que hay en la tabla producto.

    public void Listar_Nombre_Productos() throws Exception {
        try {

            Collection<Producto> productos = dao.listarProductosNombre();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("Lista de Productos por nombre: ");
                for (Producto aux : productos) {
                    System.out.println(aux.getNombre());
                }
            }

        } catch (Exception e) {
            throw e;
        }

    }

    //Lista los nombres y los precios de todos los productos de la tabla producto.
    public void Listar_NombrePrecio_Productos() throws Exception {
        try {
            System.out.println("-----------------------------------------------");
            System.out.println("Lista de Productos por nombre y precio: ");

            Collection<Producto> productos = dao.listarProductosNombrePrecio();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {

                for (Producto aux : productos) {
                    System.out.print(aux.getNombre() + "\t\t");

                    System.out.print(aux.getPrecio() + "$ \n");

                }
            }

        } catch (Exception e) {
            throw e;
        }

    }

    // Listar aquellos productos que su precio esté entre 120 y 202
    public void Listar_Rango() throws Exception {
        try {
            System.out.println("-----------------------------------------------");
            System.out.println("Lista de Productos con precio entre 120 y 202: ");

            Collection<Producto> productos = dao.listarProductosPrecioRango();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {

                for (Producto aux : productos) {

                    System.out.println("-----------------------------");

                    System.out.println("ID#: " + aux.getCodigo());
                    System.out.println("NOMBRE: " + aux.getNombre());
                    System.out.println("PRECIO: " + aux.getPrecio() + "$");
                    System.out.println("ID FAB#: " + aux.getCodigoFabricante());
                    System.out.println("-----------------------------");

                }
            }

        } catch (Exception e) {
            throw e;
        }

    }

    //Buscar y listar todos los Portátiles de la tabla producto
    public void Listar_Portatiles() throws Exception {
        try {
            System.out.println("-----------------------------------------------");
            System.out.println("Lista de Portátiles de la tabla Producto: ");

            Collection<Producto> productos = dao.listarProductosPortatiles();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos en la lista");

            } else {

                for (Producto aux : productos) {

                    System.out.println("-----------------------------");

                    System.out.println("ID#: " + aux.getCodigo());
                    System.out.println("NOMBRE: " + aux.getNombre());
                    System.out.println("PRECIO: " + aux.getPrecio() + "$");
                    System.out.println("ID FAB#: " + aux.getCodigoFabricante());
                    System.out.println("-----------------------------");

                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }

    //Listar el nombre y el precio del producto más barato
    public void Listar_ProductoMasBarato() throws Exception {
        try {
            System.out.println("-----------------------------------------------");
            System.out.println("Producto más barato: ");

            Collection<Producto> productos = dao.listarProductoMasBarato();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos en la lista");

            } else {

                for (Producto aux : productos) {

                    System.out.println("-----------------------------");

                    //System.out.println("ID#: " + aux.getCodigo());
                    System.out.println("NOMBRE: " + aux.getNombre());
                    System.out.println("PRECIO: " + aux.getPrecio() + "$");
                    //System.out.println("ID FAB#: " + aux.getCodigoFabricante());
                    System.out.println("-----------------------------");

                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }

    //Ingresar un producto a la base de datos
    public void Ingresar_producto() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Producto prod_temp = new Producto();
        FabricanteServicio fabri_temp1 = new FabricanteServicio();
        try {
            System.out.println("-----------------------------------------------");
            System.out.println("Ingrese nuevo producto a la base de datos: ");

            System.out.println("1) Ingrese nombre del producto: ");
            prod_temp.setNombre(leer.next());
            System.out.println("Ahora ingrese precio del producto: ");
            prod_temp.setPrecio(leer.nextDouble());
            System.out.println("A continuación se muestran los códigos de fabricantes disponibles: ");
            fabri_temp1.Listar_Fabricantes();
            ////////////////////////
            System.out.println("Ahora ingrese código del fabricante: ");
            prod_temp.setCodigoFabricante(leer.nextInt());

            dao.guardarProducto(prod_temp);
            System.out.println("Producto Guardado");

        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }

    // h) Editar un producto con datos a elección.
    public void Modificar_producto() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Producto prod_temp = new Producto();
        FabricanteServicio fabri_temp1 = new FabricanteServicio();
        boolean flagsalir = false;
        try {
            System.out.println("Lista de productos:");

            Collection<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {

                for (Producto aux : productos) {

                    System.out.println("-----------------------------");

                    System.out.println("ID#: " + aux.getCodigo());
                    System.out.println("NOMBRE: " + aux.getNombre());
                    System.out.println("PRECIO: " + aux.getPrecio() + "$");
                    System.out.println("ID FAB#: " + aux.getCodigoFabricante());
                    System.out.println("-----------------------------");

                }
            }

            System.out.println("Seleccione un código de producto a modificar:");
            int id = leer.nextInt();
            
            prod_temp = dao.SeleccionarProductoID(id);
            //prod_temp.setCodigo(leer.nextInt());
            /*  do {

                System.out.println("Desea modificar el código de producto? [S] [N]");
                String opcion = leer.next();
                opcion = opcion.toUpperCase();
                if (opcion.equals('S')) {
                    System.out.println("Ingrese el nuevo código: ");
                    prod_temp.setCodigo(leer.nextInt());
                    flagsalir = true;
                } else if (opcion.equals('N')) {
                    flagsalir = true;
                } else {
                    System.out.println("Opcion incorrecta. Intente nuevamente");
                }

            } while (flagsalir == false);

            flagsalir = false;
             */
            do {

                System.out.println("Desea modificar el nombre de producto? [S] [N]");
                String opcion = leer.next();
                opcion = opcion.toUpperCase();
                if (opcion.equals("S")) {
                    System.out.println("Ingrese el nuevo nombre: ");
                    prod_temp.setNombre(leer.next());
                    flagsalir = true;
                } else if (opcion.equals("N")) {
                    flagsalir = true;
                } else {
                    System.out.println("Opcion incorrecta. Intente nuevamente");
                }

            } while (flagsalir == false);
            flagsalir = false;

            do {

                System.out.println("Desea modificar el precio de producto? [S] [N]");
                String opcion = leer.next();
                opcion = opcion.toUpperCase();
                if (opcion.equals("S")) {
                    System.out.println("Ingrese el nuevo precio: ");
                    prod_temp.setPrecio(leer.nextDouble());
                    flagsalir = true;
                } else if (opcion.equals("N")) {
                    flagsalir = true;
                } else {
                    System.out.println("Opcion incorrecta. Intente nuevamente");
                }

            } while (flagsalir == false);

            flagsalir = false;

            do {

                System.out.println("Desea modificar el Código de Fabricante de producto? [S] [N]");
                String opcion = leer.next();
                opcion = opcion.toUpperCase();
                if (opcion.equals("S")) {
                    System.out.println("Lista de fabricantes:");
                    fabri_temp1.Listar_Fabricantes();
                    System.out.println("Ingrese el nuevo código de Fabricante: ");
                    prod_temp.setCodigoFabricante(leer.nextInt());
                    flagsalir = true;
                } else if (opcion.equals("N")) {
                    flagsalir = true;
                } else {
                    System.out.println("Opcion incorrecta. Intente nuevamente");
                }

            } while (flagsalir == false);

            dao.modificarProducto(prod_temp);
            System.out.println("Producto Modificado");

        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }

}
