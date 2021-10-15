package ej_herencia_3;

import ej_herencia_3.entidades.Electrodomestico;
import ej_herencia_3.entidades.Lavadora;
import ej_herencia_3.entidades.Televisor;
import java.util.ArrayList;

public class Ej_Herencia_3 {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> lista1 = new ArrayList();

        Lavadora lavadora1 = new Lavadora((double) 35, (double) 1000, "blanco", 'D', (double) 35);
        lista1.add(lavadora1);
        lavadora1.precioFinal();
        Lavadora lavadora2 = new Lavadora((double) 40, (double) 1000, "negro", 'C', (double) 25);
        lista1.add(lavadora2);
        lavadora2.precioFinal();
        Televisor tv1 = new Televisor(50, true, (double) 1000, "negro", 'A', (double) 40);
        lista1.add(tv1);
        tv1.precioFinal();
        Televisor tv2 = new Televisor(21, false, (double) 1000, "blanco", 'C', (double) 20);
        lista1.add(tv2);
        tv2.precioFinal();

        double Total_Televisor = 0;
        double Total_Lavadora = 0;
        for (Electrodomestico aux : lista1) {
            if (aux instanceof Televisor) {
                System.out.println("Precio Television: $" + aux.getPrecio());
                Total_Televisor = Total_Televisor + aux.getPrecio();
            }
            if (aux instanceof Lavadora) {
                System.out.println("Precio Lavadora: $" + aux.getPrecio());
                Total_Lavadora = Total_Lavadora + aux.getPrecio();
            }
        }

        System.out.println("\nLa suma de todos los televisores es : $" + Total_Televisor);
        System.out.println("La suma de todos las lavadoras es : $" + Total_Lavadora);
        System.out.println("La suma total es: $" + (Total_Televisor + Total_Lavadora));

    }

}
