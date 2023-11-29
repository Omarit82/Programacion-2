package Practica7.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
public class Principal {
    public static void main(String[] args) {
        Persona omar = new Persona("Omar", "Roselli", 41);
        Persona male = new Persona("Malena", "Griffiths", 38);
        Persona mini = new Persona("Soledad","Roselli",47);
        Persona viole = new Persona("Violeta", "Venier", 12);
        Persona rober = new Persona("Roberto","Roselli",38);

        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(omar);
        personas.add(male);
        personas.add(mini);
        personas.add(viole);
        personas.add(rober);
        
        ComparadorNombre nombre = new ComparadorNombre();
        ComparadorApellido apellido = new ComparadorApellido(nombre);
        ComparadorEdad edad = new ComparadorEdad(apellido);
       

        System.out.println("Lista como se cargo: ");
        System.out.println(personas);

        System.out.println("Lista utilizando el compareTo de Persona que compara por apellido: ");
        Collections.sort(personas);
        System.out.println(personas);

        System.out.println("Lista comparando por nombre: ");
        Collections.sort(personas,nombre);
        System.out.println(personas);

        System.out.println("Lista comparando por apellido: ");
        Collections.sort(personas,apellido);
        System.out.println(personas);

        System.out.println("Lista comparando por edad: ");
        Collections.sort(personas,edad);
        System.out.println(personas);

        System.out.println("Compara inicialmente por edad,luego por apellido y finalmente por nombre: ");
        Collections.sort(personas,edad);
        System.out.println(personas);


    }
    
}
