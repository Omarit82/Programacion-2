package PersonasComparadorV2;

public class ComparadorApellido extends ComparadorPersona {

    @Override
    public int comparar(Persona p1, Persona p2) {
        return p1.getApelllido().compareTo(p2.getApelllido());
    }
}
