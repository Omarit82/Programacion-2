package Practica7.Steaming;

public class RentableUno extends Criterio {
    private String genero;
    private int duracion;

    public RentableUno(String genero, int duracion){
        this.genero = genero;
        this.duracion = duracion;
    }

    public boolean cumple(Pelicula p){
        if(p.getDuracion()<duracion && !p.getGenero().equals(genero)){
            return true;
        }else{
            return false;
        }
    }
    
}
