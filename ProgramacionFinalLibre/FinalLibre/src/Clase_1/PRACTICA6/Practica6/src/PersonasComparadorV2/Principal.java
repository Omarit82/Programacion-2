package PersonasComparadorV2;
import java.util.ArrayList;


public class Principal {
    
    public static void main(String[] args) {
        ArrayList <Persona> personas = new ArrayList<Persona>();
        Persona uno = new Persona("Omar", "Roselli", 29555208, 41);
        Persona dos = new Persona("Malena", "Griffiths", 31625325, 38);
        Persona tres = new Persona("Loberto", "Roselli", 31854789, 38);
        Persona cuatro = new Persona("Maria", "Inclan", 5795903, 75);

        personas.add(uno);
        personas.add(dos);
        personas.add(tres);
        personas.add(cuatro);

    
        
    }
}
