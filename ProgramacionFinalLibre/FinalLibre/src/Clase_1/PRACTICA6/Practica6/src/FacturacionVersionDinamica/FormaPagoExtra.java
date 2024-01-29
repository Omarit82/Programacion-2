package FacturacionVersionDinamica;

public class FormaPagoExtra extends FormaPago{

    private double ventas;
    private int porcentaje;

    public FormaPagoExtra(double sueldo, double ventas, int porcentaje) {
        super(sueldo);
        this.ventas = ventas;
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularSueldo() {
       return getSueldo() + (ventas * porcentaje/100);
    }
    
    
}
