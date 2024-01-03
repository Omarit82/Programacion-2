package Clase_1.PRACTICA2.EstablecimientoDeportivo;

import java.time.LocalDate;

public class Turno {

    /*Atributos */
    private Usuario usuario;
    private LocalDate fecha;
    
    /* Constructor */
    public Turno(Usuario usuario, int day, int month, int year){
        this.usuario = usuario;
        fecha = LocalDate.of(year, month, day);
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    
}
