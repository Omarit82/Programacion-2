package Clase_1.PRACTICA2.JuegoDadosMesa;

public class Dado {
    /* Atributos del dado */
    private int cantidadCaras;
    private int ultimoValor;


    /* Constructor */
    public Dado(int cantidadCaras){
        this.cantidadCaras = cantidadCaras;
        this.ultimoValor = tirar();
    }

    /* Metodos del dado. */

    public int getCantidadCaras(){
        return cantidadCaras;
    }

    public int tirar(){
        ultimoValor = (int) (Math.random()*cantidadCaras+1);
        return ultimoValor;
    }
    
    public int getUltimoValor(){
        return ultimoValor;
    }
}
