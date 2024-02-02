package ComparadorV3;
import java.util.Comparator;
public abstract class ComparadorPersona implements Comparator<Persona>{

    private ComparadorPersona siguiente;

    public ComparadorPersona(ComparadorPersona siguiente){
        this.siguiente = siguiente;
    }

    public ComparadorPersona(){
        this.siguiente = null;
    }

    public abstract int comparar(Persona p1, Persona p2);
    @Override
    public int compare(Persona o1, Persona o2) {
        int aux = comparar(o1, o2);
        if(aux == 0 ){
            if(siguiente != null){
                return siguiente.compare(o1, o2);
            }else{
                return 0;
            }
            
        }else return aux;
    }
    
}
