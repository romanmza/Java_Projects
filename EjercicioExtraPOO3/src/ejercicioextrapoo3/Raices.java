package ejercicioextrapoo3;

public class Raices {

    private int a;
    private int b;
    private int c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

//Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante() {
        double discriminante;
        discriminante = Math.pow(b, 2) - (4 * a * c);
        //System.out.println(discriminante);
        return discriminante;
    }

//Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0
    public boolean tieneRaices() {
        if (getDiscriminante() > 0) {
            return true;
        } else {
            return false;
        }

    }
//Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
//para que esto ocurra, el discriminante debe ser igual que 0.

    public boolean tieneRaiz() {
        if (getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }

    }

//Método obtenerRaices(): llama a tieneRaíces() y si devolvió true, imprime las 2
//posibles soluciones.
//CAMBIO: el llamado a tieneRaiz y tieneRaices se hace desde el método calcular, entonces no se requiere llamarlos dos veces. Por lo tanto
    //los métodos obtener sólo calculan la/s raíz/raices y la/s muestra/n por pantalla.
    
    //Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
//delante de -b
    public void obtenerRaices() {

        System.out.println("Solución1: " + (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        System.out.println("Solución2: " + (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));

    }

//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz() {
        if (tieneRaiz() == true) {
            
            System.out.println("Solución única: " + (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));

        }
    }

//Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
//caso de no existir solución, se mostrará un mensaje
    public void calcular() {

        if (tieneRaices() == true) {
            System.out.println("Tiene 2 soluciones distintas");
            obtenerRaices();

        } else {
            if (tieneRaiz() == true) {
                System.out.println("Tiene una única solución");
                obtenerRaiz();
            } else {
                System.out.println("La ecuación no tiene soluciones reales (sólo complejas)");
            }
        }
    }

}
