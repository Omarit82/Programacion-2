package Practica7.Steaming;

public class CriterioEstrenoDuracion extends Criterio {
    private int anio;
    private int duracion;

    public CriterioEstrenoDuracion(int duracion, int anio){
        this.duracion = duracion;
        this.anio = anio;
    }

    public boolean cumple(Pelicula p){
        if(p.getAnio()<anio && p.getDuracion()<duracion){
            return true;
        }else{
            return false;
        }
    }
    
}
