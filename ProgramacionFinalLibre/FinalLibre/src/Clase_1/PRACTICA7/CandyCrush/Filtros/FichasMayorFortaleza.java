package CandyCrush.Filtros;

import CandyCrush.*;

public class FichasMayorFortaleza extends Filtro{
    private int fortaleza;

    public FichasMayorFortaleza(int fortaleza){
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean cumple(Ficha ficha){
        if(ficha.getFortaleza()>fortaleza){
            return true;
        }else{
            return false;
        }
    }
}
