package Vivero;

public class CriterioClasificacion extends Criterio{

    private String clasificacion;

    public CriterioClasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }
    @Override
    public boolean cumple(Planta planta){
        if(planta.getClasificacion().equals(clasificacion)){
            return true;
        }else{
            return false;
        }
    }
}
