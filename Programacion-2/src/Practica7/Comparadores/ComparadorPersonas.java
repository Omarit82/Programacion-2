package Practica7.Comparadores;
import java.util.Comparator;

public abstract class ComparadorPersonas implements Comparator<Persona> {

    private ComparadorPersonas siguiente;

    public ComparadorPersonas(){ //Caso de que cree un Comparador sin siguiente.
        siguiente =null;
    }

    public ComparadorPersonas(ComparadorPersonas siguiente){ //Caso de que necesite un siguiente comparador.
        this.siguiente=siguiente;
    }


    public int compare(Persona p1, Persona p2){
        int aux = this.comparar(p1,p2);
        if(aux == 0){
            if (siguiente != null){
                return siguiente.compare(p1, p2);
            } else {
                return 0;
            }
        }
        return aux;
    }

    
    public abstract int comparar(Persona p1,Persona p2);
    
}
