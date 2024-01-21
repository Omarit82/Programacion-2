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
        /* Se chequea que evaluadores pueden evaluar el trabajo pasado por parametro. */
        ArrayList<Evaluador> auxiliar = new ArrayList<>();
        for (Evaluador evaluador : evaluadores) {
            if(tt.puedeEvaluar(evaluador)){
                auxiliar.add(evaluador);
            }
        }
        return auxiliar;
    }

    public ArrayList<Trabajo> puedeAsignar(Evaluador ee){
        /* Se chequea que trabajos puede evaluar el evaluador pasado por parametro */
        ArrayList<Trabajo> auxiliar = new ArrayList<>();
        for (Trabajo trabajo : trabajos) {
            if(trabajo.puedeEvaluar(ee)){
                auxiliar.add(trabajo);
            }
        }
        return auxiliar;
    }

    public boolean esExperto(Evaluador ee){
        /* Sera experto si conoce alguno de los temas en el array de temas expertos */
        int i = 0;
        boolean experto = false;
        while (i<temasExpertos.size() && !experto){
            if(ee.tieneTag(temasExpertos.get(i))){
                experto = true;
                System.out.println("El Evaluador: "+ee.getNombre());
                System.out.println("Es experto en: "+temasExpertos.get(i));
            }
            i++;
        }
        return experto;
    }
}
