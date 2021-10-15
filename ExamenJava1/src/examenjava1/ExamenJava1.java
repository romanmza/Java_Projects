


package examenjava1;

import examenjava1.prueba;

public class ExamenJava1 {


    public static void main(String[] args) {

        String palabra = "gato";
        String invertida = "";
//        String palabra_jeringoso = "";
//
//        for (int i = 0; i < palabra.length(); i++) {
//
//            if (palabra.charAt(i) == 'a' ||  palabra.charAt(i) == 'e'||palabra.charAt(i) == 'i'||palabra.charAt(i) == 'o'||palabra.charAt(i) == 'u') {
//                
//                palabra_jeringoso = palabra_jeringoso + palabra.charAt(i)+ "p"+ palabra.charAt(i);
//
//            }
//            else
//            {
//                palabra_jeringoso = palabra_jeringoso + palabra.charAt(i);
//            }
//        }
//        
//        
//        System.out.println(palabra_jeringoso);

palabra.toLowerCase()

        for (int i = palabra.length()-1; i >=0; i--) {
            
            invertida = invertida + palabra.charAt(i);
            
        }
        System.out.println(invertida);




    }

}
