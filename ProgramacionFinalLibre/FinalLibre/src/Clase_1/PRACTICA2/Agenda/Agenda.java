package Clase_1.PRACTICA2.Agenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Reunion> reuniones;
    
    public Agenda(){
        reuniones = new ArrayList<>();
    }

    public void addReunion(Reunion reunion){
        reuniones.add(reunion);
    }

    public String toString(){
        return "Reuniones: "+reuniones;
    }

}
