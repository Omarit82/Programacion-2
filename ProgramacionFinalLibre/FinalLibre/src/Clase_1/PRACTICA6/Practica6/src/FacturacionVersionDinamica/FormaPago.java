package FacturacionVersionDinamica;

public abstract class FormaPago {
    private double sueldo;

    public FormaPago(double sueldo){
        this.sueldo = sueldo;
    }

    public abstract double calcularSueldo();

    public double getSueldo(){
        return sueldo;
    }
}
