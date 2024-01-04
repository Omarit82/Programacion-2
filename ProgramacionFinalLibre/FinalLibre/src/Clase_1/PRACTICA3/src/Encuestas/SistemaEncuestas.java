package Encuestas;

import java.util.ArrayList;

public class SistemaEncuestas {
    /*Atributos */
    private ArrayList<Encuesta> encuestas;

    public SistemaEncuestas(){
        encuestas = new ArrayList<>();
    }

    public void addEncuesta(Encuesta ee){
        encuestas.add(ee);
    }

    public void responderEncuesta(Cuestionario cuestionario, Persona persona, Encuestador encuestador){
        /* Evento de responder la encuesta */
        /*Debo chequear si el cuestionario esta entre los cuestionarios de las encuestas guardadas. */
        boolean check = false;
        for (Encuesta encuesta : encuestas) {
            if((encuesta.getCuestionario() == cuestionario)&&(encuesta.getPersona().getDni() == persona.getDni())){
                check = true;
            }
        }
        if(check == false){
            Encuesta encuesta = new Encuesta(encuestador, persona, cuestionario);    
            this.addEncuesta(encuesta);
            
        }

        

    }
    
}
