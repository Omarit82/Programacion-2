package Futbol5.Comparadores;
import Futbol5.Socio;

public class ComparadorApellido extends Comparador{

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
    
}
