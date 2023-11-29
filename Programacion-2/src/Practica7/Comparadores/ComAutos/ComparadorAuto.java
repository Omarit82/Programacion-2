package Practica7.Comparadores.ComAutos;
import java.util.Comparator;

public abstract class ComparadorAuto implements Comparator<Auto>{
    private ComparadorAuto siguiente;

    public ComparadorAuto(){
        siguiente = null;
    }
    public ComparadorAuto (ComparadorAuto siguiente){
        this.siguiente = siguiente;
    }

    public int compare(Auto a1, Auto a2){
        int aux = this.comparar(a1, a2);
        if(aux == 0){
            if (siguiente != null){
                return siguiente.compare(a1, a2);
            } else {
                return 0;
            }
        }
        return aux;
    }

    public abstract int comparar(Auto a1, Auto a2);
    
}
