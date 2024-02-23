package SistemaArchivos.Busqueda;

import SistemaArchivos.ElementoSistema;

public class BusquedaNot extends Busqueda{
    private Busqueda search;

    public BusquedaNot(Busqueda search){
        this.search = search;
    }
    @Override
    public boolean cumple(ElementoSistema elemento){
        return !search.cumple(elemento);
    }    
}
