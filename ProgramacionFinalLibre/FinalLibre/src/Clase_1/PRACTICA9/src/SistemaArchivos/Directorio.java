package SistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

import SistemaArchivos.Busqueda.Busqueda;
import SistemaArchivos.Ordenamiento.Orden;

public class Directorio extends ElementoSistema{

    private ArrayList<ElementoSistema> elementos;

    public Directorio(String nombre, LocalDate fechaCreacion){
        super(nombre, fechaCreacion);
        elementos = new ArrayList<>();
    }

    public void agregaElemento(ElementoSistema elemento){
        super.archivoModificado();
        elementos.add(elemento);
    }

    @Override
    public double getTamanio(){
        double tamanio = 0;
        for (ElementoSistema elemento : elementos) {
            tamanio += elemento.getTamanio();
        }
        return tamanio;
    }
    @Override
    public int cantidadArchivos(){
        int cantidad = 0;
        for (ElementoSistema elementoSistema : elementos) {
            cantidad += elementoSistema.cantidadArchivos();
        }
        return cantidad;
    }

    @Override
    public int cantidadElementos(){
        int cantidad = 0;
        for (ElementoSistema elementoSistema : elementos) {
            cantidad += elementoSistema.cantidadElementos();
            
        }
        return cantidad+1;
    }

    /* Para el Sistema */
    public ArrayList<ElementoSistema> busquedaElementos(Busqueda busqueda, Orden orden){
        ArrayList<ElementoSistema> retorno =new ArrayList<>();
        for (ElementoSistema elementoSistema : elementos) {
            if(busqueda.cumple(elementoSistema)){
                
            }
        }
    }
}
