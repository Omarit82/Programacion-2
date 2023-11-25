package Practica7.Comparadores;
import java.util.Comparator;

public class ComparadorApellido implements Comparator<Persona>{
    
    @Override
    public int compare(Persona per1,Persona per2){
        return (per1.getApellido().compareTo(per2.getApellido()));
    }
    
}
