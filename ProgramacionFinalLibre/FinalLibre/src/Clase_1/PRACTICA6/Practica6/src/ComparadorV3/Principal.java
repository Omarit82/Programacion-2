package ComparadorV3;
import java.util.Collections;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        ArrayList <Persona> personas = new ArrayList<Persona>();
        Persona uno = new Persona("Loberto", "Roselli", 29555208, 41);
        Persona dos = new Persona("Malena", "Griffiths", 31625325, 38);
        Persona tres = new Persona("Loberto", "Roselli", 31854789, 38);
        Persona cuatro = new Persona("Maria", "Inclan", 5795903, 75);

        personas.add(uno);
        personas.add(dos);
        personas.add(tres);
        personas.add(cuatro);

        ComparadorPersona com1 = new ComparadorEdad();
        ComparadorPersona com2 = new ComparadorNombre(com1);
        ComparadorPersona com3 = new ComparadorApellido(com2);

        Collections.sort(personas,com3);
        System.out.println(personas);
    }
}
