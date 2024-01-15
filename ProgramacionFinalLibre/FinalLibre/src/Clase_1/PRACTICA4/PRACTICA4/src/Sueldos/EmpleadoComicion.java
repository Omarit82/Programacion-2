package Sueldos;

import java.util.ArrayList;

public class EmpleadoComicion extends Empleado {
    private double porcentaje;
    private ArrayList<Double>ventas;

    public EmpleadoComicion(String nombre,double sueldoFijo,double porcentaje,int dni){
        super(nombre,sueldoFijo,dni);
        ventas = new ArrayList<>();
        this.porcentaje = porcentaje;
    }
   
    @Override
    public double getSueldo(){
        double extra = 0.0;
        for (Double item : ventas) {
            extra += (item*porcentaje/100);
        }
        return super.getSueldo()+extra;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void agregarVenta(double venta){
        ventas.add(venta);
    }
    
}
