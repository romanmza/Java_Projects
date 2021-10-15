package ejercicioextrapoo2_2;

import java.util.Timer;

public class Tiempo {

    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo() {
    }

    public Tiempo(int hora, int minutos, int segundos) {

        if (hora >= 0 && hora < 24) {

            this.hora = hora;
        } else {
            System.out.println("Valor incorrecto para el ingreso de hora. Se iniciará en 0");
        }
        if (minutos >= 0 && minutos < 60) {

            this.minutos = minutos;
        } else {
            System.out.println("Valor incorrecto para el ingreso de minutos. Se iniciará en 0");
        }

        if (segundos >= 0 && segundos < 60) {

            this.segundos = segundos;
        } else {
            System.out.println("Valor incorrecto para el ingreso de segundos. Se iniciará en 0");
        }
        Timer timer1 = new Timer();

    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void imprimirHoraCompleta() {

        segundos++;

        if (segundos == 60) {
            minutos++;
            segundos = 0;
            if (minutos == 60) {
                hora++;
                minutos = 0;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        //   System.out.println("Son las " + hora + ":" + minutos + ":" + segundos + "hs");
        System.out.printf("Son las %02d:%02d:%02d hs\n", hora, minutos, segundos);
    }

    public void runClock() {

        do {

            imprimirHoraCompleta();
            wait(1000);

        } while (true);

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
