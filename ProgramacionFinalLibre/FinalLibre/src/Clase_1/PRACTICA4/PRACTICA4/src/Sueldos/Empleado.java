package Sueldos;

public class Empleado {
    private double sueldoFijo;

    public Empleado(double sueldoFijo){
        this.sueldoFijo = sueldoFijo;
    }

    public void setSueldo(double sueldo){
        sueldoFijo = sueldo;
    }

    public double getSueldo(){
        return sueldoFijo;
    }
}
