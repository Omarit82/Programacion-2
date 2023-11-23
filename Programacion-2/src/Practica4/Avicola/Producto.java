package Practica4.Avicola;

import java.time.LocalDate;

public class Producto {
    private LocalDate vencimiento;
    private int lote;
    private LocalDate envasado;
    private String granjaOrigen;

    public Producto(LocalDate vencimiento, int lote, LocalDate envasado, String granjaOrigen) {
        this.vencimiento = vencimiento;
        this.lote = lote;
        this.envasado = envasado;
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public LocalDate getEnvasado() {
        return envasado;
    }

    public void setEnvasado(LocalDate envasado) {
        this.envasado = envasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }
    
    
    
}
