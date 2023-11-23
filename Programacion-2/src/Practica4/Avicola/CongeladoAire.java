package Practica4.Avicola;

import java.time.LocalDate;

public class CongeladoAire extends Producto {
    private int oxi;
    private int nitro;
    private int co2;
    private int agua;

    public CongeladoAire(LocalDate vencimiento, int lote, LocalDate envasado, String granjaOrigen,int oxi, int nitro, int co2, int agua) {
        super(vencimiento, lote, envasado, granjaOrigen);
        this.oxi = oxi;
        this.nitro = nitro;
        this.co2 = co2;
        this.agua = agua;
    }

    public int getOxi() {
        return oxi;
    }

    public void setOxi(int oxi) {
        this.oxi = oxi;
    }

    public int getNitro() {
        return nitro;
    }

    public void setNitro(int nitro) {
        this.nitro = nitro;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }
    
    public String toString(){
        return "PRODUCTO CONGELADO POR AIRE"+"\n"+"Vencimiento: "+this.getVencimiento()+"\n"+
        "Envasado: "+this.getEnvasado()+"\n"+
        "Lote: "+this.getLote()+"\n"+
        "Origen: "+this.getGranjaOrigen()+"\n"+
        "Concentraciones de nitrogeno / oxigeno /co2 /agua : "+this.getNitro()+" | "+this.getOxi()+" | "+this.getCo2()+" | "+this.getAgua()+"\n";
    }
    
}
