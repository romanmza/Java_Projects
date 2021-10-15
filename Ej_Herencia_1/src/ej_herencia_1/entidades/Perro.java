package ej_herencia_1.entidades;

public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    //Sobreescribimos el método Alimentarse para adaptarlo a lo que muestre cada clase (polimorfismo)
    @Override
    public void alimentarse()
    {
        System.out.println("El Perro "+this.nombre + " se alimenta de " + this.alimento);
    
    }



}
