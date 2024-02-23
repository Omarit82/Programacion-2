package SistemaArchivos.Busqueda;

import SistemaArchivos.ElementoSistema;

public class BusquedaNombre extends Busqueda {
    private String busqueda;

    public BusquedaNombre(String busqueda){
        this.busqueda = busqueda;
    }
    @Override
    public boolean cumple(ElementoSistema elemento){

        return elemento.getNombre().contains(busqueda);
    }
}
