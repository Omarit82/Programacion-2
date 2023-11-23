package Practica4.Avicola;

import java.time.LocalDate;

public class CongeladoAgua extends Refrigerado {
    private double salinidad;

    public CongeladoAgua(LocalDate vencimiento, int lote, LocalDate envasado, String granjaOrigen, int codigo,
            double tempRecomendada, double salinidad) {
        super(vencimiento, lote, envasado, granjaOrigen, codigo, tempRecomendada);
        this.salinidad = salinidad;
    }

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }
    public String toString(){
        return "PRODUCTO CONGELADO POR AGUA"+"\n"+"Vencimiento: "+this.getVencimiento()+"\n"+
        "Envasado: "+this.getEnvasado()+"\n"+
        "Lote: "+this.getLote()+"\n"+
        "Origen: "+this.getGranjaOrigen()+"\n"+
        "Salinidad: "+this.getSalinidad();
    }

}
