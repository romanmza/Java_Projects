package ej_herencia_1;

import ej_herencia_1.entidades.Animal;
import ej_herencia_1.entidades.Caballo;
import ej_herencia_1.entidades.Gato;
import ej_herencia_1.entidades.Perro;

public class Ej_Herencia_1 {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");

        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");

        perro1.alimentarse();

        perro2.alimentarse();
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.alimentarse();

        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();

        // Animal gato = new Gato
    }

}
