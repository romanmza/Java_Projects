package ejerciciocollect_1_1_bis.servicios;

import ejerciciocollect_1_1_bis.entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioPerro {
    private Scanner leer;
    
    private ArrayList <Perro> ListaPerros;

    
    //con el constructor vacío, cada vez que llamemos al método, hacemos nacer un nuevo objeto del tipo ArrayList
    public ServicioPerro() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.ListaPerros = new ArrayList();
    }
    
    
    
    private Perro crearPerro()
    {
        System.out.println("Ingrese nombre de raza de perro: ");
        String raza = leer.next();
        
        System.out.println("Ingrese nombre de perro:");
        String nombre = leer.next();
        
        return new Perro(raza,nombre);
        
        
        
    }
    
    private void agregarALista(Perro p)
    {
        ListaPerros.add(p);
    }
          
    public void agregarPerro()
    {
        agregarALista(crearPerro());
    }
            
    public void mostrarPerros()
    {
        System.out.println("Los perros agregados a la lista son: ");
        for(Perro aux:ListaPerros)
        {
            System.out.println(aux);  
        }
        System.out.println("Otra forma:");
        System.out.println(ListaPerros.toString());
        System.out.println("La cantidad de perros en la lista es: ");
        System.out.println(ListaPerros.size());
        
    }

    @Override
    public String toString() {
        return "ServicioPerro{" + "leer=" + leer + ", ListaPerros=" + ListaPerros + '}';
    }
    
    
    
    



}
