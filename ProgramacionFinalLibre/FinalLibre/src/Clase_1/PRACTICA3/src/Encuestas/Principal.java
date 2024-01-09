package Encuestas;

public class Principal{
    public static void main(String[] args) {
        Persona malenaPuerca = new Persona("Malena Puerca", 31625325);
        Encuestador omar = new Encuestador("Omar Roselli", 29555208, 450);
        Cuestionario quiz1 = new Cuestionario();

        Encuesta encuesta = new Encuesta(omar, malenaPuerca, quiz1);
    }
}