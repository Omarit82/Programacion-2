package Composite.Practica.Prefinal82023;
import java.util.Comparator;

public abstract class Ordenador implements Comparator<Juguete>{
    
    private Ordenador siguiente;

    public Ordenador(){
        siguiente = null;
    }

    public Ordenador(Ordenador siguiente){
        this.siguiente = siguiente;
    }

    public abstract int comparar(Juguete j1, Juguete j2);

    public int compare(Juguete j1,Juguete j2){
        int aux = this.comparar(j1, j2);
        if(aux == 0){
            if(siguiente != null){
                return siguiente.compare(j1, j2);
            }else{
                return 0;
            }
        }
        return aux;
    } 
}
