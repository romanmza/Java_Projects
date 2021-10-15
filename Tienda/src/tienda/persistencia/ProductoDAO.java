//a) Lista el nombre de todos los productos que hay en la tabla producto. ------------>LISTO
//b) Lista los nombres y los precios de todos los productos de la tabla producto.15 ------------>LISTO
//c) Listar aquellos productos que su precio esté entre 120 y 202.
//d) Buscar y listar todos los Portátiles de la tabla producto.
//e) Listar el nombre y el precio del producto más barato.
//f) Ingresar un producto a la base de datos.
//g) Ingresar un fabricante a la base de datos
//h) Editar un producto con datos a elección
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }

            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + producto.getCodigo() + "' , '" + producto.getNombre() + "', '" + producto.getPrecio() + "', '" + producto.getCodigoFabricante() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            //String sql = "SELECT codigo, nombre ,precio, codigo_fabricante FROM producto ";
            String sql = "SELECT * FROM producto ";
            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

//b) Lista los nombres y los precios de todos los productos de la tabla producto.
    public Collection<Producto> listarProductosNombrePrecio() throws Exception {
        try {
            String sql = "SELECT nombre ,precio FROM producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
//a) Lista el nombre de todos los productos que hay en la tabla producto.

    public Collection<Producto> listarProductosNombre() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();

                producto.setNombre(resultado.getString(1));

                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

//c) Listar aquellos productos que su precio esté entre 120 y 202.
    public Collection<Producto> listarProductosPrecioRango() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio >=120 AND precio<=202 ";
            //Otra forma:
            //String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    //d) Buscar y listar todos los Portátiles de la tabla producto
    public Collection<Producto> listarProductosPortatiles() throws Exception {
        try {
            //String sql = "SELECT * FROM producto WHERE nombre = 'Portátil'";
            String sql = "SELECT * FROM producto WHERE nombre LIKE 'Potátil%'";

            consultarBase(sql);

            Producto producto = null;
            List<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            //e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
//e) Listar el nombre y el precio del producto más barato.

    public Collection<Producto> listarProductoMasBarato() throws Exception {
        try {

            String sql = "SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    //h) Editar un producto con datos a elección
    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE producto SET nombre = '" + producto.getNombre() + "',precio='" + producto.getPrecio()
                    + "',codigo_fabricante='" + producto.getCodigoFabricante() + "' WHERE codigo = '" + producto.getCodigo() + "';";

            insertarModificarEliminar(sql);
            System.out.println("Producto modificado");
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    //aux: Buscar productos por ID
    public Producto SeleccionarProductoID(int id) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo LIKE "+id ;
            //Otra forma:
            //String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202";

            consultarBase(sql);

            Producto producto = null;
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
