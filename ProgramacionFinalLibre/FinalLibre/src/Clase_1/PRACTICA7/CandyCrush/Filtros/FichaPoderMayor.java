package CandyCrush.Filtros;

import CandyCrush.Ficha;

public class FichaPoderMayor extends Filtro {
    private int mayor;

    public FichaPoderMayor(int mayor){
        this.mayor = mayor;
    }
    @Override
    public boolean cumple(Ficha ficha){
        if(ficha.getPoderDestruccion()>mayor){
            return true;
        }else{
            return false;
        }
    }
    
}
