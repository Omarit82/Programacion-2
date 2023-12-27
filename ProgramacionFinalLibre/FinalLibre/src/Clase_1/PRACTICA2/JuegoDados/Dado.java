package Clase_1.PRACTICA2.JuegoDados;

public class Dado {
    private int caras;
    private int ultimoValor;

    public Dado(int caras){
        this.caras = caras;
        ultimoValor = this.tirar();
    }

    public int getCaras(){
        return caras;
    }

    public int tirar(){
        /* Math Random [0,1) -->*6-->[0,6)-->+1-->[1,7) */
        ultimoValor = (int) (Math.random()*caras + 1);
        return ultimoValor;
    }

    public int getUltimoValor(){
        return ultimoValor;
    }

}
