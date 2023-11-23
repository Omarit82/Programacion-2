package Practica4.Seleccion;

import java.time.LocalDate;

public class Integrante {
    private String nombre;
    private String apellido;
    private long pasaporte;
    private LocalDate fechaNacimiento;
    private String estado;

    public Integrante(String nombre,String apellido,long pasaporte,int year,int month,int day){
        fechaNacimiento = LocalDate.of(year, month, day);
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        estado = "En pais de origen";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(long pasaporte) {
        this.pasaporte = pasaporte;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public boolean disponible(){
        boolean disponible = false;
        if(estado.equals("En pais de origen")){
            disponible =true;
            return disponible;
        }else{
            return disponible;
        }
    }
}
