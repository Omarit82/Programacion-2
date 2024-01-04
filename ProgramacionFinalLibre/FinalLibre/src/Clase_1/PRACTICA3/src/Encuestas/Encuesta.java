package Encuestas;

public class Encuesta {

    /*Atributos */
    private Cuestionario cuestionario;
    private static int idEncuesta; //Contador de clase.
    private Encuestador encuestador;
    private Persona persona;

    /*Constructor */
    public Encuesta(Encuestador encuestador,Persona persona, Cuestionario cuestionario ){
        this.encuestador = encuestador;
        this.persona = persona;
        this.cuestionario = cuestionario;
        idEncuesta++;
    }
    /*Metodos */
    public Encuestador getEncuestador(){
        return encuestador;
    }

    public Persona getPersona(){
        return persona;
    }

    public Cuestionario getCuestionario(){
        return cuestionario;
    }

    public int getIdEncuesta(){
        return idEncuesta;
    }
    
}
