package Futbol5.Filtros;

import Futbol5.Socio;

public class FiltroAlquilerCancha extends Filtro{
    private int idCancha;

    public FiltroAlquilerCancha(int idCancha){
        this.idCancha = idCancha;
    }

    public boolean cumple(Socio socio){
        boolean alquilo =false;
        if(socio.alquiloCancha(idCancha) != 0){
            alquilo = true;
        }
        return alquilo;
    }
    
}
