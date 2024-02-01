package PersonasComparador;
import java.util.Comparator;
public class CompApellidoNombre implements Comparator<Persona>{
    
    @Override
    public int compare(Persona p1, Persona p2){
        int aux = p1.getApelllido().compareTo(p2.getApelllido());
        if(aux == 0){
            return p1.getNombre().compareTo(p2.getNombre());
        }
        return aux;
    }
}
