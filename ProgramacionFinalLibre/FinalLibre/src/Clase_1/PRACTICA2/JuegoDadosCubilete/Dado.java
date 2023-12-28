package Clase_1.PRACTICA2.JuegoDadosCubilete;

public class Dado {
    private int cantidadCaras;
    private int ultimoValor;

    public Dado(int cantidadCaras){
        this.cantidadCaras = cantidadCaras;
        this.ultimoValor = tirar();
    }

    public int getCantidadCaras(){
        return cantidadCaras;
    }

    public int tirar(){
        ultimoValor = (int) (Math.random()*6+1);
        return ultimoValor;
    }
    
    public int getUltimoValor(){
        return ultimoValor;
    }
}
