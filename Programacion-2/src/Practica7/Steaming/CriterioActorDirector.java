package Practica7.Steaming;

public class CriterioActorDirector extends Criterio {
    private String director;
    private String actor;

    public CriterioActorDirector(String director, String actor){
        this.director = director ;
        this.actor = actor;
    }
    public boolean cumple(Pelicula p){
        if(p.participaActor(actor) && !p.getDirector().equals(director)){
            return true;
        }else{
            return false;
        }
    }
    
}
