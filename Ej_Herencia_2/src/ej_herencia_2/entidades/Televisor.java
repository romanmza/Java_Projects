package ej_herencia_2.entidades;

public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, Double precio, String color, char consumo_energetico, Double peso) {
        super(precio, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public Televisor crearTelevisor() {
        crearElectrodomestico();
        System.out.println("Ingrese la resolución (en pulgadas) del televisor: ");
        resolucion = leer.nextInt();
        System.out.println("El TV dispone de sintonizador digital? [S] para sí, [N] para no: ");
        String TDT = leer.next();
        if (TDT.equals("S")) {
            this.TDT = true;
        } else if (TDT.equals("N")) {
            this.TDT = false;
        } else {
            System.out.println("Valor incorrecto. Se agregará dispositivo sin sintonizador digital.");
            this.TDT = false;
        }

        return new Televisor(resolucion, this.TDT, precio, color, consumo_energetico, peso);
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            precio = precio * 1.3;
        }
        if (TDT == true) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" + "precio=" + precio + ", color=" + color + ", consumo_energetico=" + consumo_energetico + ", peso=" + peso + "resolucion=" + resolucion + "TDT=" + TDT + '}';
    }

}
