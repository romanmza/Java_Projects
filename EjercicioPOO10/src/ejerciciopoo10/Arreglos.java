package ejerciciopoo10;

import java.util.Arrays;

public class Arreglos {

    private double arreglo1[] = new double[50];
    private double arreglo2[] = new double[20];

    public Arreglos() {
    }

    public double[] getArreglo1() {
        return arreglo1;
    }

    public void setArreglo1(double[] arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public double[] getArreglo2() {
        return arreglo2;
    }

    public void setArreglo2(double[] arreglo2) {
        this.arreglo2 = arreglo2;
    }

    public void randomA() {

        //Arrays.fill(arreglo1, (int) (Math.random()*10));
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = (Math.random() * 100);
//            System.out.println("Arreglo 1 Elemento " + i + " : " + arreglo1[i]);

        }
        System.out.println("Arreglo 1: " + Arrays.toString(arreglo1));

    }

    public void ordenarA1() {
        Arrays.sort(arreglo1);

        System.out.println("Arreglo 1 ordenado: " + Arrays.toString(arreglo1));

    }

    public void copy10_and_fill10() {
        
        
        //en esta línea para copiar parte del contenido de arreglo1 que es int a arreglo2 que es double, metemos la instrucción
        //arrays.copyOf (que devuelve un entero) dentro del arrays.stream y le agregamos .asDOubleSrtream para que lo convierta a double
       // arreglo2 = Arrays.stream(Arrays.copyOf(arreglo1, 20)).asDoubleStream().toArray();
        arreglo2 = Arrays.copyOf(arreglo1, 20);

        Arrays.fill(arreglo2, 10, 20, 0.5);
        System.out.println("Arreglo 2: los primeros 10 números son una copia de Arreglo1, los siguientes 10 son 0.5");
        System.out.println("Arreglo 2: " + Arrays.toString(arreglo2));

    }
}
