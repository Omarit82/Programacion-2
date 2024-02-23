package Futbol5.Comparadores;

import java.util.Comparator;
import Futbol5.Socio;

public abstract class Comparador implements Comparator<Socio>{
    
    public abstract int compare(Socio o1, Socio o2);
}
