package PersonasComparadorV2;
import java.util.Comparator;

public abstract class ComparadorPersona implements Comparator<Persona>{
    private Comparator<Persona> siguiente;

    public ComparadorPersona(Comparator<Persona> siguiente){
        this.siguiente = siguiente;
    }

    public ComparadorPersona(){
        this.siguiente = null;
    }
    public abstract int comparar(Persona p1, Persona p2);

    @Override
    public int compare(Persona p1, Persona p2){
        int aux = comparar(p1,p2);
        if(aux == 0 ){
            /* En caso de que sea igual, paso al siguiente comparador! */
            return siguiente.compare(p1, p2);
        }else return aux;
    }
}
