package ejerciciopoo9;

public class Matematica {

    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }
//Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor  

    public double devolverMayor() {
        return Math.max(num1, num2);
    }

    //Método para devolver el mayor, accesible fuera de la clase, sin necesidad de definir antes un objeto
    public static double devolverporfuera(double num1, double num2) {
        return Math.max(num1, num2);
    }

//Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia() {

        int potencia = (int) Math.pow(Math.round(num1), Math.round(num2));
        System.out.println("Número 1 redondeado: " + Math.round(num1));
        System.out.println("Número 2 redondeado: " + Math.round(num2));
        System.out.println("La pontencia del número 1 elevado al número 2 es: " + potencia);

    }
//Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

    public void calcularRaiz() {
        double menor = Math.abs(Math.min(num1, num2));
        
        System.out.println("Valor absoluto del menor número: "+menor);
        double raiz = Math.sqrt (Math.abs(menor));   
        
        System.out.println("La raíz cuadradra del número menor es: " + raiz);
    }
}
