package Futbol5.Filtros;

import Futbol5.Socio;

public class FiltroNot extends Filtro{
    private Filtro ff1;

    public FiltroNot(Filtro ff1){
        this.ff1 = ff1;
    }

    @Override
    public boolean cumple(Socio socio) {
        return !ff1.cumple(socio);
    }
    
}
