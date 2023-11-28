package Practica7.Comparadores;
import java.util.Comparator;

public abstract class ComparadorPersonas implements Comparator<Persona> {

    private Comparator<Persona> siguiente;

    public ComparadorPersonas(Comparator<Persona> siguiente){
        this.siguiente = siguiente;
    }

    public int compare (Persona per1, Persona per2){
       int resultado = this.comparar(per1,per2);
       if(resultado == 0){
        return siguiente.compare(per1,per2);
       }
       return resultado;
    }

    public abstract int comparar(Persona per1,Persona per2);
}
