package Composite.Practica;

import java.util.ArrayList;

public class Empleado extends ElementoEmpresa{

    private String nombre;
    private String apellido;
    private String especialidad;
    private double sueldo;

    public Empleado(String nombre, String apellido, String especialidad, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
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
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public double sueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public int cantidadEmpleados(){
        return 1;
    }

    
    public boolean equals(Object obj){
        try {
            Empleado empleado = (Empleado) obj;
            return (this.getNombre().equals(empleado.getNombre()))&&(this.getApellido().equals(empleado.getApellido()));
        }catch(Exception e){
            return false;
        }
        
    }
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad + ", sueldo="
                + sueldo + "]";
    }
    @Override
    public ArrayList<Empleado> empleadosCon(String especialidad) {
        ArrayList<Empleado> aux = new ArrayList<>();
        if(this.getEspecialidad().equals(especialidad)){
            aux.add(this);
        }
        return aux;
    }
}
