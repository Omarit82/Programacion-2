package Sueldos;

public class Empleado {
    private double sueldoFijo;
    private int dni;
    private String nombre;

    public Empleado(String nombre,double sueldoFijo, int dni){
        this.sueldoFijo = sueldoFijo;
        this.dni = dni;
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo){
        sueldoFijo = sueldo;
    }

    public double getSueldo(){
        return sueldoFijo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return getNombre()+", DNI: "+getDni()+", Sueldo: "+getSueldo()+"\n"+"__________________________"+"\n";
    }

    @Override
    public boolean equals(Object empleado2){
        try {
            Empleado auxiliar = (Empleado) empleado2;
            if(this.getNombre().equals(auxiliar.getNombre()) && auxiliar.getDni() == this.getDni()){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    } 
    
}
