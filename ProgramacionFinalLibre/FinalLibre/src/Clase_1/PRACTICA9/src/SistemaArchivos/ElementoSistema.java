package SistemaArchivos;

import java.time.LocalDate;

public abstract class ElementoSistema {
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion = null;
    
    public ElementoSistema(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        archivoModificado();
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaModificacion(){
        return fechaModificacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void archivoModificado(){
        fechaModificacion = LocalDate.now();
    }
    
    public abstract double getTamanio();
    public abstract int cantidadArchivos();
    public abstract int cantidadElementos();
    @Override
    public String toString(){
        return "Name: "+getNombre()+"\n"+"Fecha de creacion: "+getFechaCreacion()+"\n";
    }
}
