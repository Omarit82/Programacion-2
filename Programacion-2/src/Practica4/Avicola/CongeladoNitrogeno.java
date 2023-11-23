package Practica4.Avicola;

import java.time.LocalDate;

public class CongeladoNitrogeno extends Producto {
    private String metodo;
    private int exposicion;

    public CongeladoNitrogeno(LocalDate vencimiento, int lote, LocalDate envasado, String granjaOrigen,int exposicion) {
        super(vencimiento, lote, envasado, granjaOrigen);
        metodo = "Congelado por Nitrogeno";
        this.exposicion = exposicion;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public int getExposicion() {
        return exposicion;
    }

    public void setExposicion(int exposicion) {
        this.exposicion = exposicion;
    }

    public String toString(){
        return "PRODUCTO CONGELADO POR NITROGENO"+"\n"+"Vencimiento: "+this.getVencimiento()+"\n"+
        "Envasado: "+this.getEnvasado()+"\n"+
        "Lote: "+this.getLote()+"\n"+
        "Origen: "+this.getGranjaOrigen()+"\n"+
        "Metodo: "+this.getMetodo()+"\n"+
        "Tiempo de exposicion: "+this.getExposicion();
    }
    
    
}
