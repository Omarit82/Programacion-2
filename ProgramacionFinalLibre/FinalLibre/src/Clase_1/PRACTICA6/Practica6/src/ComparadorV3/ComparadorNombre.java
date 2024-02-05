package ComparadorV3;

public class ComparadorNombre extends ComparadorPersona {
    /*Constructores */
    public ComparadorNombre(){}
    public ComparadorNombre(ComparadorPersona siguiente) {
        super(siguiente);
    }
    /* Metodo */
    @Override
    public int comparar(Persona p1, Persona p2){
        return p1.getNombre().compareTo(p2.getNombre());
    }
}
