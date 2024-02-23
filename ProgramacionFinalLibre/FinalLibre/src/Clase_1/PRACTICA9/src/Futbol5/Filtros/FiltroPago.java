package Futbol5.Filtros;

import Futbol5.Socio;

public class FiltroPago extends Filtro{
    private int costo;

    public FiltroPago(int costo){
        this.costo = costo;
    }

    public boolean cumple(Socio socio){
        return socio.pagoCancha(costo);
    }
    
}
