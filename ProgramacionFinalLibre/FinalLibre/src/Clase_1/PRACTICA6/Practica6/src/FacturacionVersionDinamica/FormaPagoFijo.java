package FacturacionVersionDinamica;

public class FormaPagoFijo extends FormaPago {

    public FormaPagoFijo(double sueldo){
        super(sueldo);
    }
    
    @Override
    public double calcularSueldo() {
        return super.getSueldo();
    }
    
}
