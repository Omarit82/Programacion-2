package ComparadorV3;

public class ComparadorNombre extends ComparadorPersona {
    
    public ComparadorNombre(){}
    public ComparadorNombre(ComparadorPersona siguiente) {
        super(siguiente);
    }

    @Override
    public int comparar(Persona p1, Persona p2){
        return p1.getNombre().compareTo(p2.getNombre());
    }
}
