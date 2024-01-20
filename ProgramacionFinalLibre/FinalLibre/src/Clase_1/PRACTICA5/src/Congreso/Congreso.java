package Congreso;

import java.util.ArrayList;

public class Congreso {

    private ArrayList<Trabajo> trabajos;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<String> temasGenerales;
    private ArrayList<String> temasExpertos;

    public Congreso(){
        trabajos = new ArrayList<>();
        evaluadores = new ArrayList<>();
        temasGenerales = new ArrayList<>();
        temasExpertos = new ArrayList<>();
    }

    public void agregarEvaluador(Evaluador ee){
        evaluadores.add(ee);
    }

    public void agregarTrabajo(Trabajo tt){
        trabajos.add(tt);
    }
    public void addTemaExperto(String tt){
        tt = tt.toLowerCase();
        temasExpertos.add(tt);
    }
    public void addTemaGenerales(String tt){
        tt = tt.toLowerCase();
        temasGenerales.add(tt);
    }

    public ArrayList<Evaluador> puedeEvaluar(Trabajo tt){
        ArrayList<Evaluador> auxiliar = new ArrayList<>();
        for (Evaluador evaluador : evaluadores) {
            if(tt.puedeEvaluar(evaluador)){
                auxiliar.add(evaluador);
            }
        }
        return auxiliar;
    }

    public ArrayList<Trabajo> puedeAsignar(Evaluador ee){
        ArrayList<Trabajo> auxiliar = new ArrayList<>();
        for (Trabajo trabajo : trabajos) {
            if(trabajo.puedeEvaluar(ee)){
                auxiliar.add(trabajo);
            }
        }
        return auxiliar;
    }
}
