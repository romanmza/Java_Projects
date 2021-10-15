package ej_herencia_2.entidades;

public class Lavadora extends Electrodomestico {

    public Lavadora() {
    }
    
    

    private Double carga;

    public Lavadora(Double carga, Double precio, String color, char consumo_energetico, Double peso) {
        super(precio, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
//    Método crearLavadora (): este método llama a crearElectrodomestico() de la
//clase padre, lo utilizamos para llenar los atributos heredados del padre y
//después llenamos el atributo propio de la lavadora

    public Lavadora crearLavadora() {

        crearElectrodomestico();
        System.out.println("Ingrese carga de la lavadora: ");
        carga = leer.nextDouble();    
        return new Lavadora(carga,precio, color, consumo_energetico, peso);
    }
    
    @Override
    public void precioFinal()
    {
        super.precioFinal();
        if (carga > 30) {
            precio += 500;
        }
        
    }

@Override
    public String toString() {
        return "Lavadora{" + "precio=" + precio + ", color=" + color + ", consumo_energetico=" + consumo_energetico + ", peso=" + peso + "carga=" + carga + '}';
    }




    
    

}
