package SistemaArchivos.Busqueda;
import java.time.LocalDate;

import SistemaArchivos.ElementoSistema;
public class BusquedaModificacion extends Busqueda{
    private LocalDate nueva;

    public BusquedaModificacion(LocalDate nueva){
        this.nueva = nueva;
    }
    @Override
    public boolean cumple(ElementoSistema elemento){
        if(elemento.getFechaModificacion() != null){
            return elemento.getFechaModificacion().isBefore(nueva);
        }
        return false;
    }
    
}
