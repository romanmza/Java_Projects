package ejercicioextrapoo5;

import java.util.Scanner;

public class mesSecreto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //String[] meses = new String[12];
    private int mes_secreto;
    private String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    //meses[0]="enero";

    public mesSecreto() {
    }

    public mesSecreto(int mes_secreto) {
        this.mes_secreto = mes_secreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public int getMes_secreto() {
        return mes_secreto;
    }

    public void setMes_secreto(int mes_secreto) {
        this.mes_secreto = mes_secreto;
    }

    //primero generamos un valor aleatorio
    public void inicio() {
        double num = Math.random() * 12;
        mes_secreto = (int) num;
        System.out.println(mes_secreto);
    }

    public boolean comparador(String in_mes) {
     //   System.out.println(in_mes);
        if(in_mes.equals(meses[mes_secreto]))
        {
        return true;
        }
        else
        {
            return false;
        }
    }

}
