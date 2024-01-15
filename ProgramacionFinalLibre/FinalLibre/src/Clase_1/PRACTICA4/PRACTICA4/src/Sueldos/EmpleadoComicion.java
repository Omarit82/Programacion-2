package Sueldos;

import java.util.ArrayList;

public class EmpleadoComicion extends Empleado {
    private double porcentaje;
    private int qVentas;
    private ArrayList<Double>ventas;

    public EmpleadoComicion(double sueldoFijo,double porcentaje){
        super(sueldoFijo);
        ventas = new ArrayList<>();
        this.porcentaje = porcentaje;
    }
    public void agregarVenta(double venta){
        ventas.add(venta);
    }

    @Override
    public double getSueldo(){
        double extra = 0;
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

    public int getqVentas() {
        return qVentas;
    }

    public void setqVentas(int qVentas) {
        this.qVentas = qVentas;
    }
    
}
