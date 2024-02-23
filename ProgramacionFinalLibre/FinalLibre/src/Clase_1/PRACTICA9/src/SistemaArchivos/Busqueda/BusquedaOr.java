package SistemaArchivos.Busqueda;

import SistemaArchivos.ElementoSistema;

public class BusquedaOr extends Busqueda{

    private Busqueda search1;
    private Busqueda search2;

    public BusquedaOr(Busqueda search1, Busqueda search2){
        this.search1 = search1;
        this.search2 = search2;
    }
    @Override
    public boolean cumple(ElementoSistema elemento){
        return search1.cumple(elemento)|| search2.cumple(elemento);
    }

}

