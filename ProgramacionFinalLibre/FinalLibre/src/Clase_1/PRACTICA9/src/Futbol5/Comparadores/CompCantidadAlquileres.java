package Futbol5.Comparadores;
import Futbol5.Socio;
public class CompCantidadAlquileres extends Comparador{
    private int idCancha;

    public CompCantidadAlquileres(int idCancha){
        this.idCancha = idCancha;
    }
    @Override
    public int compare(Socio socio1, Socio socio2){
        return socio2.alquiloCancha(idCancha) - socio1.alquiloCancha(idCancha);
    }
    
}
