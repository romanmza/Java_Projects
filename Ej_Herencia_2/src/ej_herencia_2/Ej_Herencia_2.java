package ej_herencia_2;

import ej_herencia_2.entidades.Lavadora;
import ej_herencia_2.entidades.Televisor;

public class Ej_Herencia_2 {

    public static void main(String[] args) {

        Lavadora lavadora1 = new Lavadora();
        lavadora1.crearLavadora();
        lavadora1.precioFinal();

        Lavadora lavadora2 = new Lavadora();
        lavadora2.crearLavadora();
        lavadora2.precioFinal();

        Televisor tv1 = new Televisor();
        tv1.crearTelevisor();
        tv1.precioFinal();

        Televisor tv2 = new Televisor();
        tv2.crearTelevisor();
        tv2.precioFinal();

        System.out.println(lavadora1.toString());
        System.out.println(lavadora2.toString());
        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
    }

}
