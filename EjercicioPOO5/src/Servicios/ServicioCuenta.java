package Servicios;

import ejerciciopoo5.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Método creador de objetos:
//creamos un método CrearCuenta que devuelve un objeto del tipo Cuenta con sus atributos
    public Cuenta CrearCuenta() {

        System.out.println("Ingrese Numero de Cuenta");
        int nroCuenta = leer.nextInt();
        System.out.println("Ingrese DNI del cliente:");
        long dni_cliente = leer.nextLong();
        System.out.println("Ingrese valor a depositar (saldo actual): ");
        double saldoactual = leer.nextDouble();

        return new Cuenta(nroCuenta, dni_cliente, saldoactual);
    }

    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a
//ingresar y se la sumara a saldo actual.
    //este método en realidad recibe el objeto del tipo Cuenta y modifica el atributo saldoactual
    public void ingresar(Cuenta c) {
        //  primero obtengo el atributo saldo actual del objeto que pasé como argumento y lo asigno a una variable local
        double saldoactual = c.getSaldo_actual();
        System.out.println("Ingrese la cantidad de dinero a depositar: ");
        saldoactual = saldoactual + leer.nextDouble();

        //luego con el método set escribo el atributo saldo actual del objeto que había pasado como argumento
        c.setSaldo_actual(saldoactual);

    }

    // Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
    public void retirar(Cuenta c) {
        System.out.println("Ingrese monto a retirar: ");
        double monto_retiro = leer.nextDouble();
        if (monto_retiro > c.getSaldo_actual()) {
            c.setSaldo_actual(0);
            System.out.println("Monto solicitado mayor a fondos. Se pondrá saldo en 0");
        } else {
            monto_retiro = c.getSaldo_actual() - monto_retiro;
            c.setSaldo_actual(monto_retiro);

            // c.setSaldo_actual(c.getSaldo_actual()-monto_retiro);
        }
    }

    // Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//que el usuario no saque más del 20%.
    public void extraccionRapida(Cuenta c) {
        double monto_retiro;

        do {
            System.out.println("Ingrese monto a retirar (menor al 20% del saldo)");
            monto_retiro = leer.nextDouble();

            if (monto_retiro > c.getSaldo_actual() * 0.2) {
                System.out.println("Monto mayor al 20% permitido para extracción rápida");
                
            } else {
                c.setSaldo_actual(c.getSaldo_actual() - monto_retiro);
                // c.setSaldo_actual(monto_retiro);
            }
        } while (monto_retiro > c.getSaldo_actual() * 0.2);
    }

    //• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(Cuenta c) {
        System.out.println("Su saldo actual es: " + c.getSaldo_actual());
    }

//• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(Cuenta c) {
        System.out.println("Datos cuenta bancaria: ");
        System.out.println("-----------------------------");
        System.out.println("Número de cuenta: " + c.getNumeroCuenta());
        System.out.println("DNI: " + c.getDNI());
        System.out.println("Saldo actual: " + c.getSaldo_actual());
        System.out.println("-----------------------------");

    }

}
