package Clase_1.PRACTICA2.JuegoDadosTrampa;

public class DadoCargado extends Dado {

    private int caraCargada;
    private double probabilidad;

    public DadoCargado(int cantidadCaras,int caraCargada,double probabilidad) {
        super(cantidadCaras);
        this.caraCargada = caraCargada;
        this.probabilidad = probabilidad;
    }

    public int getCaraCargada() {
        return caraCargada;
    }

    public void setCaraCargada(int caraCargada) {
        this.caraCargada = caraCargada;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public int tirar(){
        if(Math.random()>probabilidad){
            return super.tirar();
        }else{
            return caraCargada;
        }
    }
    
}
