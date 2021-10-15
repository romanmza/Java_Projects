package examen1;

//public class Examen {
//    public Boolean parCieloPiso(int numEnt, double numReal, long numLargo) {
//        // Acá escribí la lógica necesaria
//
//        double numtemp = numReal + 0.5;
//        int num1 = (int) numtemp;
//        int num2 = (int) numReal;
//
//        if ((numEnt % 2 == 0) && num1 == num2 && (numLargo >= 0)) {
//            return true;
//        } else {
//
//            return false;
//        }
//    }
public class Examen {

    public String geringoso(String palabra) {
        // Acá escribí la lógica necesaria
        String palabra_jeringoso = "";

        for (int i = 0; i < palabra.length(); i++) {

            if (palabra.charAt(i) == 'a') {
                
                palabra_jeringoso = palabra_jeringoso + palabra.charAt(i)+ "p"+ palabra.charAt(i);

            }
            else
            {
                palabra_jeringoso = palabra_jeringoso + palabra.charAt(i);
            }
        }

        return palabra_jeringoso;
    }
}
