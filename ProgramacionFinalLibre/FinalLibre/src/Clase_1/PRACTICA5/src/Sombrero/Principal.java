package Sombrero;
/* SISTEMA DE ASIGNACION DE ALUMNOS. */
public class Principal {
    public static void main(String[] args) {
        Casa ravenclaw = new Casa("Ravenclaw");
        Casa hufflepuff = new Casa("HufflePuff");
        Casa slytherin = new CasaExclusiva("Slytherin");
        Casa griffindor = new Casa("Griffindor");

        ravenclaw.agregarCualidad("inteligencia");
        ravenclaw.agregarCualidad("sagacidad");
        griffindor.agregarCualidad("valor");
        slytherin.agregarCualidad("valor");
        griffindor.agregarCasaEnemiga(slytherin);
        slytherin.agregarCasaEnemiga(hufflepuff);
    }
}
