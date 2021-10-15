//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
//del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
//por una E. Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//.
//.
//0-1-2
//0-1-E
package ejercicio18;



public class Ejercicio18 {

    public static void main(String[] args) {

        String decena = "";
        String unidad = "";
        String centena = "";

        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {

                    if (j == 3) {
                        unidad = "E";
                    } else {

                        unidad = String.valueOf(j);
                    }

                    if (i == 3) {
                        decena = "E";
                    } else {

                        decena = String.valueOf(i);
                    }
                    
                    if (k == 3) {
                        centena = "E";
                    } else {

                        centena = String.valueOf(k);
                    }
                    System.out.println("Salida: " +centena +"-"+decena + "-" + unidad);

                }
            }

        }
    }
}
