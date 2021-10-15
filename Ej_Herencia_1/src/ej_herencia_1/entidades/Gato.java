package ej_herencia_1.entidades;


public class Gato extends Animal {

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    //Sobreescribimos el método Alimentarse para adaptarlo a lo que muestre cada clase (polimorfismo)
        @Override
    public void alimentarse()
    {
        System.out.println("El Gato "+this.nombre + " se alimenta de " + this.alimento);
    
    }


}
