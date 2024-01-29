package FacturacionVersionDinamica;

public class FormaPagoHE extends FormaPago {
    private int horas;
    private double valorHora;

    public FormaPagoHE(double sueldo, int horas,double valorHora) {
        super(sueldo);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return super.getSueldo() + (horas*valorHora);
    }
    
}
