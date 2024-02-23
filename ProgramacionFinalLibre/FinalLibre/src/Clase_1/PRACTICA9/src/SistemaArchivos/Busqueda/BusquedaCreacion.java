package SistemaArchivos.Busqueda;
import java.time.LocalDate;

import SistemaArchivos.ElementoSistema;
public class BusquedaCreacion extends Busqueda{
    private LocalDate fecha;

    public BusquedaCreacion(LocalDate fecha){
        this.fecha = fecha;
    }
    @Override
    public boolean cumple(ElementoSistema elemento){
        return elemento.getFechaCreacion().isAfter(fecha);
    }
    
}
