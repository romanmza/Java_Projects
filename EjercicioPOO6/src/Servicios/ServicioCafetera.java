package Servicios;

import ejerciciopoo6.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//Método que crea un nuevo objeto de la clase  Cafetera
    public Cafetera NuevaCafetera() {
        System.out.println("Ingrese capacidad máxima [cm3] de la Cafetera: ");
        int cap_maxima = leer.nextInt();

        return new Cafetera(cap_maxima, cap_maxima);

    }

//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
    public void LlenarCafetera(Cafetera c) {

        System.out.print("Llenando Cafetera al máximo");
        wait(1000);
        System.out.print(".");
        wait(1000);
        System.out.print(".");
        wait(1000);
        System.out.print(".");
        System.out.println("");

        c.setCantidadActual(c.getCapacidadMaxima());
        System.out.println("Cafetera llena.");

    }

// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza:
    public void ServirTaza(Cafetera c) {
        System.out.println("Ingrese el tamaño [cm3] de una taza vacía: ");
        int capacidad_taza = leer.nextInt();

        System.out.print("Sirviendo taza");
        wait(1000);
        System.out.print(".");
        wait(1000);
        System.out.print(".");
        wait(1000);
        System.out.print(".");
        System.out.println("");

        if (c.getCantidadActual() < capacidad_taza) {
            System.out.println("Café insuficiente en la cafetera para completar la taza.");
            System.out.println("La taza se llenó con " + c.getCantidadActual() + " [cm3] de café.");
            c.setCantidadActual(0);
        } else {
            System.out.println("Taza llena. Disfrute su café.");
            c.setCantidadActual(c.getCantidadActual() - capacidad_taza);
        }

    }

    //Método vaciarCafetera(): pone la cantidad de café actual en cero:
    public void VaciarCafetera(Cafetera c) {
        System.out.println("Vaciando cafetera");
        wait(1000);
        System.out.print(".");
        wait(1000);
        System.out.print(".");
        wait(1000);
        System.out.print(".");
        System.out.println("");

        c.setCantidadActual(0);
        System.out.println("Cafetera vacía.");
    }

    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.
    public void AgregarCafe(Cafetera c) {

        int agregar_cafe;
        int resto;

        if (c.getCantidadActual() == c.getCapacidadMaxima()) {
            System.out.println("La cafetera ya está llena. No se necesita recargar.");
        } else {

            do {

                System.out.println("Ingrese la cantidad de café [cm3] a agregar a la cafetera: ");
                agregar_cafe = leer.nextInt();

                resto = c.getCapacidadMaxima() - c.getCantidadActual();

                if (agregar_cafe > resto) {

                    System.out.println("Cantidad mayor a la que soporta la cafetera. Ingrese un valor menor.");

                } else {
                    
                    c.setCantidadActual(agregar_cafe + c.getCantidadActual());

                    System.out.println("Agregando café");
                    wait(1000);
                    System.out.print(".");
                    wait(1000);
                    System.out.print(".");
                    wait(1000);
                    System.out.print(".");
                    System.out.println("");

                    System.out.println("Café agregado a la cafetera.");
                    System.out.println("La cafetera ahora dispone de " + c.getCantidadActual() + " [cm3] de café.");
                }
            } while (agregar_cafe > resto);
        }
    }

    //rutina de tiempo en milisegundos
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
