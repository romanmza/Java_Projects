package ejemplo_poo;

import ejemplo_poo.entidades.Mascota;
import java.util.Scanner;

public class Ejemplo_POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        
        //instanciamos (creamos) los objetos
        Mascota m1 = new Mascota();
        
        m1.apodo = "Chiquito";
        m1.nombre = "Fernando Chiquito";
        m1.tipo = "Perro";
        m1.edad = 14;
        m1.raza = "Beagle";
        m1.cola = true;
        m1.color = "tricolor";
        
        System.out.println("Ingrese raza:");
        
        m1.raza = leer.next();
      
        
        System.out.println(m1.apodo+" "+m1.edad+" "+m1.raza+" ");

}

}
