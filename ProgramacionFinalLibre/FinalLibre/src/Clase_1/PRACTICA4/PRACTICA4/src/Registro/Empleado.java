package Registro;

public class Empleado extends Persona{
    
    private int legajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, int edad, int legajo, double sueldo){
        super(nombre,apellido,edad);
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        String aux = super.toString();
        return aux+"Legajo: "+getLegajo()+"\n"+"Sueldo: "+getSueldo()+"\n";
    }
}
