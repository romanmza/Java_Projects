//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
//(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
//posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
//aleatoriamente.
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
//valores deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
package relaciones_2.entidades;

public class RevolverAgua {

    private Integer pos_actual;
    private Integer pos_agua;

    public RevolverAgua() {
    }

    public RevolverAgua(int pos_actual, int pos_agua) {
        this.pos_actual = pos_actual;
        this.pos_agua = pos_agua;
    }

    public Integer getPos_actual() {
        return pos_actual;
    }

    public void setPos_actual(Integer pos_actual) {
        this.pos_actual = pos_actual;
    }

    public Integer getPos_agua() {
        return pos_agua;
    }

    public void setPos_agua(Integer pos_agua) {
        this.pos_agua = pos_agua;
    }

  

    public void llenarRevolver() {
        pos_actual = (int) (Math.random() * 6)+1;      //valores aleatorios entre 1 y 10 (incluido)
        pos_agua = (int) (Math.random() * 6)+1;
        //System.out.println(pos_actual);
    }

    public boolean mojar() {
        if (pos_actual == pos_agua) {
            return true;
        } else {
            return false;
        }
    }
    public void siguienteChorro()
    {
        pos_actual ++;
        if(pos_actual ==7)
        {
            pos_actual = 1;
        }
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "pos_actual=" + pos_actual + ", pos_agua=" + pos_agua + '}';
    }
    

}
