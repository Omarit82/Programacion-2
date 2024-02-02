package PersonasComparador;
import java.util.Comparator;
public class CompCompuesto implements Comparator<Persona> {

    private Comparator<Persona> comp1;
    private Comparator<Persona> comp2;

    public CompCompuesto (Comparator<Persona> comp1,Comparator<Persona> comp2){
        comp1 = new CompApellidoNombre();
        comp2 = new ComparadorNombre();
    }
    
    @Override
    public int compare(Persona p1, Persona p2){
        int aux = comp1.compare(p1, p2);
        if (aux==0){
            return comp2.compare(p1, p2);
        }
        return aux;
    }
}
