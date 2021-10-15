


//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
//número de cartas. En caso de que haya menos cartas que las pedidas, no
//devolveremos nada, pero debemos indicárselo al usuario.
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
//ninguna indicárselo al usuario
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
//carta y luego se llama al método, este no mostrara esa primera carta.
package relaciones_3.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Baraja {

    private Carta carta;
    private ArrayList<Carta> baraja_completa;
    private ArrayList<Carta> baraja_nueva;
    private Integer posicion_mazo;
    private Iterator<Carta> it;

    public Baraja() {

        posicion_mazo = 0;

        baraja_completa = new ArrayList();
        baraja_nueva = new ArrayList();
        it = baraja_completa.iterator();
        for (int i = 1; i <= 12; i++) {

            for (int j = 0; j < 4; j++) {

                if (i != 8 && i != 9) {
                    switch (j) {
                        case 0:
                            baraja_completa.add(new Carta(i, "espada"));
                            break;
                        case 1:
                            baraja_completa.add(new Carta(i, "basto"));
                            break;
                        case 2:
                            baraja_completa.add(new Carta(i, "oro"));
                            break;
                        case 3:
                            baraja_completa.add(new Carta(i, "copa"));
                            break;

                    }
                }
            }

        }
    }
//• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        System.out.println("Barajando mazo...");
        Collections.shuffle(baraja_completa);
        System.out.println("Mazo barajado!");
    }
//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
//haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta() {

        Carta carta_actual;

        if (it.hasNext()) {
            carta_actual = it.next();
            baraja_nueva.add(carta_actual);
            it.remove();
            return carta_actual;
        } else {
            carta_actual = baraja_completa.get(0);
        }
//        
//        baraja_nueva.add(carta_actual);
//        baraja_completa.remove(carta_actual);
//        posicion_mazo++;
        return carta_actual;

    }
    
    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    
    
    

    @Override
    public String toString() {
        return "Baraja{" + "baraja_completa=" + baraja_completa + ", baraja_nueva=" + baraja_nueva + '}';
    }

}
