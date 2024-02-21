package Plataforma.Busqueda;

import Plataforma.Pelicula;

public class FiltroActor extends Filtro{

    private String actor;

    public FiltroActor(String actor){
        this.actor = actor;
    }
    @Override
    public boolean cumple(Pelicula peli){
        if(peli.tieneActor(actor)){
            return true;
        }else{
            return false;
        }
    }
    
}
