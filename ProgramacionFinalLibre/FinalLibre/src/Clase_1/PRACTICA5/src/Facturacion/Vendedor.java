package Facturacion;

import java.util.ArrayList;

public class Vendedor extends Empleado{
    private ArrayList<Double> ventas;
    private int porcentaje;

    public Vendedor(String nombre, String apellido, int dni, double sueldo, int porcentaje) {
        super(nombre, apellido, dni, sueldo);
        this.porcentaje = porcentaje;
        ventas = new ArrayList<>();
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void agregarVenta(double venta){
        ventas.add(venta);
    }
    public int cantidadVentas(){
        return ventas.size();
    }
    
    public double gananciaVentas(){
        double extra = 0;
        for (Double venta : ventas) {
            extra += venta*porcentaje/100;
        }
        return extra;
    }
    @Override
    public double getSueldo(){
        return super.getSueldo()+gananciaVentas();
    }
    
}
