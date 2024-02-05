package ComparadorAutos;

import java.util.Comparator;

public abstract class Comparador implements Comparator<Auto>{

    private Comparador siguiente;

    public Comparador(){
        siguiente = null;
    }

    public Comparador (Comparador siguiente){
        this.siguiente = siguiente;
    }

    public abstract int comparando(Auto auto1, Auto auto2);
    
    @Override
    public int compare(Auto auto1, Auto auto2){
        int auxiliar = comparando(auto1, auto2);
        if(auxiliar == 0){
            if(siguiente != null){
                return siguiente.compare(auto1, auto2);
            }else{
                return 0;
            }
        }
        return auxiliar;
    }
    
}
