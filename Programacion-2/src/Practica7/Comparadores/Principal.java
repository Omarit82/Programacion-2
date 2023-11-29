package Practica7.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
public class Principal {
    public static void main(String[] args) {
        Persona omar = new Persona("Omar", "Roselli", 41);
        Persona male = new Persona("Malena", "Griffiths", 38);
        Persona mini = new Persona("Soledad","Roselli",47);
        Persona viole = new Persona("Violeta", "Venier", 13);
        Persona rober = new Persona("Roberto","Roselli",38);

        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(omar);
        personas.add(male);
        personas.add(mini);
        personas.add(viole);
        personas.add(rober);
        
        System.out.println(personas);
        Collections.sort(personas);
        System.out.println(personas);

        ComparadorNombre comparador1 = new ComparadorNombre();
        
        Collections.sort(personas,comparador1);
        System.out.println(personas);

        ComparadorEdad comparador2 = new ComparadorEdad();

        Collections.sort(personas,comparador2);
        System.out.println(personas);
    }
    
}
