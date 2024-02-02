package PersonasComparador;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Persona>{

    @Override
    public int compare(Persona per1, Persona per2) {
        return per1.getEdad() - per2.getEdad();
    }
    
}
