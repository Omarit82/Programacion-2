package Practica7.Comparadores;
import java.util.Comparator;

public class ComparadorEdad implements Comparator<Persona>{
    public int compare(Persona p1, Persona p2){
        return p1.getEdad()-p2.getEdad();
    }
}
