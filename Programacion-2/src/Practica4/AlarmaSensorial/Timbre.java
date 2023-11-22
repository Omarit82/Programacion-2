package Practica4.AlarmaSensorial;

public class Timbre {
    private boolean sonando;


    public Timbre(){
        sonando=false;
    }

    public boolean getSonando(){
        return sonando;
    }
    public void hacerSonar(){
        sonando = true;
        System.out.println("Timbre sonando");
    }
    
}
