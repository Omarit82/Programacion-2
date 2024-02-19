package CandyCrush.Filtros;

import CandyCrush.Ficha;

public class FichaLugarMayor extends Filtro{
    private int cantidadLugares;

    public FichaLugarMayor(int cantidadLugares){
        this.cantidadLugares = cantidadLugares;
    }

    @Override
    public boolean cumple(Ficha ficha){
        if(ficha.getCantidadCasilleros()>cantidadLugares){
            return true;
        }else{
            return false;
        }
    }
}
