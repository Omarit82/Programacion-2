package Plataforma.Busqueda;

import Plataforma.Pelicula;

public class FiltroAnd extends Filtro{

    private Filtro fil1;
    private Filtro fil2;

    public FiltroAnd(Filtro fil1, Filtro fil2){
        this.fil1 = fil1;
        this.fil2 = fil2;
    }

    @Override
    public boolean cumple(Pelicula peli){
        if(fil1.cumple(peli) && fil2.cumple(peli)){
            return true;
        }else{
            return false;
        }
    }
    
}
