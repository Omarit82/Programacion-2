package Practica4;

public class Timbre {
    private int decibeles;
    private boolean sonando;


    public Timbre(int decibeles){
        this.decibeles = decibeles;
        sonando=false;
    }

    public int getDecibeles(){
        return decibeles;
    }

    public void hacerSonar(){
        sonando = true;
        System.out.println("Timbre sonando");
    }
    
}
