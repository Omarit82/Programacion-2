package Avicola;

import java.time.LocalDate;

public class Producto {
    private LocalDate fechaVencimiento;
    private int numeroLote;

    public Producto (LocalDate fechaVencimiento, int numeroLote){
        this.numeroLote = numeroLote;
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    @Override
    public String toString(){
        return  "_____________________________"+"\n"+
                "FECHA DE VENCIMIENTO: "+getFechaVencimiento()+"\n"+
                "NUMERO DE LOTE: "+getNumeroLote();
    }
    
}
