package Practica7.Comparadores;
import java.util.ArrayList;
public class Ordenamiento {

    private ArrayList<Persona> personas;

    public Ordenamiento(){
        personas = new ArrayList<Persona>();
    }

    public void addPersona (Persona p){
        personas.add(p);
    }
    public static void main(String[] args) {
        Persona male = new Persona("Griffiths", "Malena", 38);
        Persona omar = new Persona("Roselli", "Omar", 41);

        Ordenamiento ordenador = new Ordenamiento();
        ordenador.addPersona(omar);
        ordenador.addPersona(male);


        ComparadorApellido comparador1 = new ComparadorApellido();
        ComparadorEdad comparador2 = new ComparadorEdad();
        int resultado1 = comparador1.compare(omar, male);
        int resultado2 = comparador2.compare(male, omar);

        System.out.println();

        System.out.println(resultado1+" | "+resultado2);
    }
}
