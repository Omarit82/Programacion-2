package Practica4.Alarma;

public class Timbre {
    private int decibeles;
    private boolean sonando;


    public Timbre(int decibeles){
        this.decibeles = decibeles;
        sonando=false;
    }

    public boolean getSonando(){
        return sonando;
    }

    public int getDecibeles(){
        return decibeles;
    }

    public void hacerSonar(){
        sonando = true;
        System.out.println("Timbre sonando");
    }
    
}
