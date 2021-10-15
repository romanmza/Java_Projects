package ejerciciopoo4;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calc_super() {
        int superficie = base * altura;
        return superficie;

    }

    public int calc_perim() {
        int perimetro = (base + altura) * 2;
        return perimetro;

    }

    public void dibujar() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == base - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }

    }

}
