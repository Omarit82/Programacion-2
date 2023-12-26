package Clase_1.PRACTICA2.Agenda;

import java.util.ArrayList;

public class Reunion {
    private String lugar;
    private ArrayList<Integrante> integrantes;
    private String tema;
    private int duracion;

    public Reunion(String lugar, String tema, int duracion) {
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
        integrantes = new ArrayList<>();
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void addIntegrante(Integrante integrante){
        integrantes.add(integrante);
    }
    
    public String toString(){
        return "Lugar: "+lugar+"\n"
        +"Tema: "+tema+"\n"
        +"Duracion: "+duracion+"\n"
        + "Integrantes: "+integrantes+"\n";
    }
}
