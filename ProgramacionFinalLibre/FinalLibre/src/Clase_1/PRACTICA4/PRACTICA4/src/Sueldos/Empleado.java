package Sueldos;

public class Empleado {
    private double sueldoFijo;
    private int dni;

    public Empleado(double sueldoFijo, int dni){
        this.sueldoFijo = sueldoFijo;
        this.dni = dni;
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

    
}
