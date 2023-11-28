package Practica7.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
public class Ordenamiento {
    
    public static void main(String[] args) {
        Persona male = new Persona("Griffiths", "Malena", 38);
        Persona omar = new Persona("Roselli", "Omar", 41);
        Persona rober = new Persona("Roselli","Roberto",38);
        Persona mini = new Persona("Roselli","Soledad",47);
        Persona viole = new Persona("Venier","Violeta",13);

        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(omar);
        personas.add(male);
        personas.add(viole);
        personas.add(rober);
        personas.add(mini);
        ComparadorApellidoEdad comAp = new ComparadorApellidoEdad();
        Collections.sort(personas,comAp);
        System.out.println(personas); 

    }
}
