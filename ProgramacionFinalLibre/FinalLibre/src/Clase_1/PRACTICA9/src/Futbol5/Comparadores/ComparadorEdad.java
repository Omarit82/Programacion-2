package Futbol5.Comparadores;
import Futbol5.Socio;
public class ComparadorEdad extends Comparador {

    @Override
    public int compare(Socio socio1, Socio socio2){
        return socio1.getEdad()-socio2.getEdad();
    }
    
}
