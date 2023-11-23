package Practica4.Avicola;

import java.time.LocalDate;

public class Refrigerado extends Producto {

    private int codigo;
    private double tempRecomendada;

    public Refrigerado(LocalDate vencimiento, int lote, LocalDate envasado, String granjaOrigen,int codigo, double tempRecomendada) {
        super(vencimiento, lote, envasado, granjaOrigen);
        this.codigo = codigo;
        this.tempRecomendada = tempRecomendada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(double tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }

    public String toString(){
        return "PRODUCTO REFRIGERADO"+"\n"+"Vencimiento: "+this.getVencimiento()+"\n"+
        "Envasado: "+this.getEnvasado()+"\n"+
        "Lote: "+this.getLote()+"\n"+
        "Origen: "+this.getGranjaOrigen()+"\n"+
        "Temperatura Recomendada: "+this.getTempRecomendada();
    }
    
}
