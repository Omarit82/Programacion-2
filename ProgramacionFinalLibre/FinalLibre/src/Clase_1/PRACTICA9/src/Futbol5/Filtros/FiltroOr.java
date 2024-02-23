package Futbol5.Filtros;
import Futbol5.Socio;
public class FiltroOr extends Filtro{
    private Filtro ff1;
    private Filtro ff2;

    public FiltroOr(Filtro ff1,Filtro ff2){
        this.ff1 = ff1;
        this.ff2 = ff2;
    }

    public boolean cumple(Socio socio){
        return ff1.cumple(socio) || ff2.cumple(socio);
    }
}
