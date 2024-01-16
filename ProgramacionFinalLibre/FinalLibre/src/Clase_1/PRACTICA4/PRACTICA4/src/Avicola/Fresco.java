package Avicola;

import java.time.LocalDate;

public class Fresco extends Producto {

    private LocalDate fechaEnvasado;
    private String granjaOrigen;

    public Fresco(LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado,String granjaOrigen ){
        super(fechaVencimiento,numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String toString(){
        String aux = super.toString();
        return aux+"\n"+
                "FECHA DE ENVASADO: "+getFechaEnvasado()+"\n"+
                "GRANJA DE ORIGEN: "+getGranjaOrigen();
    }
}
