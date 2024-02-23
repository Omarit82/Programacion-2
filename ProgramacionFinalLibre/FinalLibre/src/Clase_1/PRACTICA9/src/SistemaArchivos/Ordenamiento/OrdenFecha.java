package SistemaArchivos.Ordenamiento;

import SistemaArchivos.ElementoSistema;

public class OrdenFecha extends Orden{

    @Override
    public int compare(ElementoSistema e1, ElementoSistema e2){
        if(e1.getFechaCreacion().isBefore(e2.getFechaCreacion())){
            return 1;
        }else if(e2.getFechaCreacion().isBefore(e1.getFechaCreacion())){
            return -1;
        }else{
            return 0;
        }
    }
    
}
