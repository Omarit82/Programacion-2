package Practica7.Comparadores;
import java.util.Comparator;

public class ComparadorNombre implements Comparator<Persona> {

     public int compare(Persona per1, Persona per2){
        return per1.getNombre().compareTo(per2.getNombre());
     }
    
}
