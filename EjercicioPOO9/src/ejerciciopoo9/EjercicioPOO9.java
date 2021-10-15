//Realizar una clase llamada Matemática que tenga como atributos dos números reales
//con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
//un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
//usará el Math.random para generar los dos números y se guardaran en el objeto con
//su respectivos set. Deberá además implementar los siguientes métodos:20
//• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.


package ejerciciopoo9;


public class EjercicioPOO9 {


    public static void main(String[] args) {
        
        Matematica objeto1 = new Matematica();

        objeto1.setNum1(Math.random()*10);
        objeto1.setNum2(Math.random()*10);
        System.out.println("Número 1: "+objeto1.getNum1());
        System.out.println("Número 2: "+objeto1.getNum2());
        
        System.out.println("El mayor número del objeto es: "+objeto1.devolverMayor());
        
        System.out.println("Utilizando un método accesible sin creación de objeto: ");
        System.out.println("El mayor número entre 1 y 5 es: "+Matematica.devolverporfuera(1, 5));
        
        objeto1.calcularPotencia();
        objeto1.calcularRaiz();
           
    }

}
