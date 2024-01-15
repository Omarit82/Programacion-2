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
    
}
