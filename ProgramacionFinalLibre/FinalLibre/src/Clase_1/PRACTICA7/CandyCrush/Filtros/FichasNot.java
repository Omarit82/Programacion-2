package CandyCrush.Filtros;

import CandyCrush.Ficha;

public class FichasNot extends Filtro{

    private Filtro filtro;

    public FichasNot(Filtro filtro){
        this.filtro = filtro;
    }
    
    @Override
    public boolean cumple(Ficha ficha){
        return !filtro.cumple(ficha);
    }
}
