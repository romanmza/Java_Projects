package pooej7;

import pooej7.entidades.Persona;
import pooej7.servicios.PersonaService;


public class Pooej7 {


    public static void main(String[] args) {
        
        PersonaService pNueva = new PersonaService();
        
        Persona per[] = new Persona[4];


        double bajo=0;
        double ideal=0;
        double sobre=0;
        double mayor=0;
       
        
        for (int i = 0; i < per.length; i++) {
            per[i] = pNueva.crearPersona();
            pNueva.calcularImc(per[i]);
            if (per[i].getImc() == -1) {
                bajo+=1;
            }if (per[i].getImc() == 0) {
                ideal+=1;
            }if(per[i].getImc() == 1){
                sobre+=1;
            }
            pNueva.esMayorDeEdad(per[i]);

            
            if (per[i].isMayor()==true) {
                mayor +=1;
 
            }            
            System.out.println("\b");
            System.out.println("\b");
        }

        
        double porcBajo = (bajo/per.length)*100;
        double porcIdeal = (ideal/per.length)*100;
        double porcSobre = (sobre/per.length)*100;
        double porcMayor = (mayor/per.length)*100;
        double porcMenor = (porcMayor-100)*(-1);
        
        System.out.println("DE LA MUESTRA SE OBTIENE QUE:");
        System.out.println("bajo el peso ideal está un "+porcBajo+"%");
        System.out.println("En el peso ideal está un "+porcIdeal+"%");
        System.out.println("Sobre el peso ideal está un "+porcSobre+"%");
        System.out.println("un "+porcMayor+"% es Mayor y "+porcMenor+"% es menor");
        
        
        for (int i = 0; i < per.length; i++) {
            System.out.println(per[i].toString());
        }
        
        
        
    }
    
}