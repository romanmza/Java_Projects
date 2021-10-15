package Servicios;

import ejercicioextrapoo2.Puntos;
import java.util.Scanner;

public class ServicioPuntos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Puntos crearPunto() {
        System.out.println("Ingrese coordenada X del 1er punto: ");
        int x1 = leer.nextInt();
        System.out.println("Ingrese coordenada Y del 1er punto: ");
        int y1 = leer.nextInt();
        System.out.println("Ingrese coordenada X del 2do punto: ");
        int x2 = leer.nextInt();
        System.out.println("Ingrese coordenada Y del 2do punto: ");
        int y2 = leer.nextInt();
        return new Puntos(x1, y1, x2, y2);
    }
    
    public void calcularDistancia(Puntos p)
    {
       
       double distancia = Math.sqrt(Math.pow((double)p.getX2()-(double)p.getX1(),2)+(Math.pow((double)p.getY2()-(double)p.getY1(),2)));
         //double distancia = Math.pow((double)p.getX2()-(double)p.getX1(),2)+Math.pow((double)p.getX2()-(double)p.getX1(),2));
        System.out.println("La distancia entre los puntos es de: "+distancia);
    }

}
