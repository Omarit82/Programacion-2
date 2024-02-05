package ComparadorV3;
import java.util.Collections;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        ArrayList <Persona> personas = new ArrayList<Persona>();
        Persona uno = new Persona("Omar", "Roselli", 29555208, 41);
        Persona dos = new Persona("Omar", "Griffiths", 31625325, 38);
        Persona tres = new Persona("Omar", "Roselli", 31854789, 41);
        Persona cuatro = new Persona("Maria", "Inclan", 5795903, 75);

        personas.add(uno);
        personas.add(dos);
        personas.add(tres);
        personas.add(cuatro);

        ComparadorPersona com1 = new ComparadorDni();
        ComparadorPersona com2 = new ComparadorEdad(com1);
        ComparadorPersona com3 = new ComparadorNombre(com2);
        ComparadorPersona com4 = new ComparadorApellido(com3);
        

        Collections.sort(personas,com4);
        System.out.println(personas);
    }
}
