package SistemaArchivos;

import java.time.LocalDate;

public class Archivo extends ElementoSistema{
    private double tamanio;

    public Archivo(String nombre, LocalDate fechaCreacion, double tamanio){
        super(nombre, fechaCreacion);
        this.tamanio = tamanio;
    }
    
    @Override
    public double getTamanio() {
        return tamanio;
    }
    
    public void setTamanio(double tamanio){
        super.archivoModificado();
        this.tamanio = tamanio;
    }

    public int cantidadArchivos(){
        return 1;
    }

    public int cantidadElementos(){
        return 1;
    }
}
