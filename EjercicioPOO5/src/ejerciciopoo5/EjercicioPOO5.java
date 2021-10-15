//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
//atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
//operaciones asociadas a dicha clase son:
//• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//• Agregar los métodos getters y setters correspondientes
//• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
//ingresar y se la sumara a saldo actual.
//• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
//• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//que el usuario no saque más del 20%.
//• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta




package ejerciciopoo5;

import Servicios.ServicioCuenta;


public class EjercicioPOO5 {


    public static void main(String[] args) {
        
        //Primero: creo un objeto servicio 1 (con el método constructor vacío) para utilizar la clase Servicio, que a su vez es la que tiene 
        //los métodos para crear los objetos cuenta
        ServicioCuenta servicio1 = new ServicioCuenta();
        
        
        //utilizo el método creador de objetos CrearCuenta de la clase de servicio. Este método me devuelve un objeto con el mismo formato
        //que necesita la clase cuenta para crear un objeto tipo Cuenta.
        
        //....o sea poner =servicio1.CrearCuenta(); es equivalente a poner = new Cuenta(nroCuenta, dni_cliente, saldoactual) 
        //sólo que no lo creamos directamente desde el main, sino desde la clase de servicio.
        Cuenta c1=servicio1.CrearCuenta();
        
        //por último llamamos a los métodos de la clase de servicio que ejecutan las órdenes que queremos (como retirar, consultar saldo, etc) y 
        //le pasamos como argumento el objeto que creamos en la instrucción anterior
        servicio1.ingresar(c1);
        servicio1.retirar(c1);
        servicio1.extraccionRapida(c1);
        servicio1.consultarSaldo(c1);
        servicio1.consultarDatos(c1);

        

    }

}
