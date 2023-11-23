package Practica4.Avicola;

import java.time.LocalDate;

public class Fresco extends Producto {

    public Fresco(LocalDate vencimiento, int lote, LocalDate envasado, String granjaOrigen) {
        super(vencimiento, lote, envasado, granjaOrigen);
    }
    public String toString(){
        return "PRODUCTO FRESCO"+"\n"+"Vencimiento: "+this.getVencimiento()+"\n"+
        "Envasado: "+this.getEnvasado()+"\n"+
        "Lote: "+this.getLote()+"\n"+
        "Origen: "+this.getGranjaOrigen();
    }

}
