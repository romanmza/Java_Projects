//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
//cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
//valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
//Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
//variable auxiliar.
package ejercicioextra2;

import java.util.Scanner;

public class EjercicioExtra2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int aux=0;

        System.out.println("Ingrese valor de variable A:");
        int varA = leer.nextInt();
        System.out.println("Ingrese valor de variable B:");
        int varB = leer.nextInt();
        System.out.println("Ingrese valor de variable C:");
        int varC = leer.nextInt();
        System.out.println("Ingrese valor de variable D:");
        int varD = leer.nextInt();

        aux = varB;
        varB = varC;
        varC=varA;
        varA=varD;
        varD=aux;
        System.out.printf("VarA: %d \n",varA);
        System.out.printf("VarB: %d \n",varB);
        System.out.printf("VarC: %d \n",varC);
        System.out.printf("VarD: %d \n",varD);

        
        
//        //mostramos salida sin decimales
//        System.out.printf("Días: %.0f\n", dias);
//        System.out.printf("Horas: %.0f\n", horas);

    }
    


}
