package Clase_1.PRACTICA2.JuegoDados;

public class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre){
        this.nombre =nombre;
        this.puntos = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public int getPuntos(){
        return puntos;
    }

    public void sumarPunto(){
        this.puntos++;
    }

    public int tirarDados(Dado d1, Dado d2){
        return d1.tirar()+d2.tirar();
    }

}
