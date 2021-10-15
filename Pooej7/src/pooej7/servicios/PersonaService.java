package pooej7.servicios;

import java.util.Scanner;
import pooej7.entidades.Persona;


public class PersonaService {
    
    public Scanner leer = new Scanner(System.in);

    public PersonaService() {
    }
    
    public Persona crearPersona(){
        String sexo = "";
        System.out.println("Ingrese nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese su sexo (F/M/O) ");
        do {
            sexo = leer.nextLine();
            if (!sexo.equalsIgnoreCase("F")&&!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("O")) {
                System.out.println("Debe ingresar F/M/O");
                sexo = leer.nextLine();
            }
        } while (!sexo.equalsIgnoreCase("F")&&!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("O"));
        
        System.out.println("Ingrese DNI");
        int dni = leer.nextInt();
        
        System.out.println("Ingrese Edad");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese peso");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese altura");
        double altura = leer.nextDouble();
        leer.nextLine();
        
        return new Persona(nombre, sexo, dni, edad, peso, altura);
    }
 
    public void calcularImc(Persona a){
        int resultado;        
        double imc = a.getPeso()/Math.pow(a.getAltura(), 2);
        
        if (imc <20) {
            resultado = -1;
        } else if (imc >=20 && imc <=25){
            resultado = 0;
        }else{
            resultado = 1;
        }        
        a.setImc(resultado);
        
    }
    
    public void esMayorDeEdad(Persona a){        
        if (a.getEdad()<18) {
            a.setMayor(false);
        }else{
            a.setMayor(true);
        }       
    }
        
        
        
    
    
    
    
    
}