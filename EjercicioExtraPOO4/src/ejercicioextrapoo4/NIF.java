package ejercicioextrapoo4;

import java.util.Scanner;

public class NIF {

    private long dni;
    private char letra;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public NIF() {
    }

    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    //Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
    public void crearNif() {
        //String[] lista = {"T", "R", "W"};
        String lista = "TRWAGMYFPDXBNJZSQVHLCKE";

        System.out.println("Ingrese DNI de la persona:");
        dni = leer.nextLong();

        //el % devuelve el resto de la operación
        int resto = (int) dni % 23;

        //el charAt devuelve el caracter ubicado en el índice que le digamos entre paréntesis
        letra = lista.charAt(resto);

       // System.out.println(letra);
    }
//Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//en mayúscula; por ejemplo: 00395469-F).
//La letra correspondiente al dígito verificador se calculará a traves de un método que
//funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
//número de DNI por 23 (el resultado debe ser un número entre 0 y 22).

    public void mostrar() {
        
        System.out.println("el NIF generado es: "+dni + "-"+letra);

    }

}
