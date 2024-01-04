package Encuestas;

import java.util.ArrayList;

public class Cuestionario {
    /*Atributos */
    private ArrayList<String> cuestionario;

    public Cuestionario(){
        cuestionario = new ArrayList<>();
    }

    public void addPregunta(String pregunta){
        cuestionario.add(pregunta);
    }
    
}
