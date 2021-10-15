package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;


public class FabricanteServicio {
        private FabricanteDAO dao;

    public FabricanteServicio() {
        this.dao = new FabricanteDAO();
    }
    
    public void Listar_Fabricantes() throws Exception {
        try {

            Collection<Fabricante> fabricantes = dao.listarFabricantes();
            if (fabricantes.isEmpty()) {
                throw new Exception("No existen Fabricantes en la lista");
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("Lista de Fabricantes: ");
                for (Fabricante aux : fabricantes) {               

                    System.out.print("ID#: " + aux.getCodigo()+"\t");
                    System.out.print("NOMBRE: " + aux.getNombre()+"\n");


                }
            }

        } catch (Exception e) {
            throw e;
        }

    }
    //g) Ingresar un fabricante a la base de datos
    public void Agregar_Fabricante() throws Exception {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Fabricante fab_temp = new Fabricante();
        
        try {
            System.out.println("-----------------------------------------------");
            System.out.println("Ingrese nuevo Fabricante a la base de datos: ");

            System.out.println("1) Ingrese nombre del Fabricante: ");
            fab_temp.setNombre(leer.next());
            System.out.println("Ahora ingrese Código del Fabricante: ");
            fab_temp.setCodigo(leer.nextInt());
            dao.guardarFabricante(fab_temp);
            System.out.println("Fabricante Guardado");

        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }

}
