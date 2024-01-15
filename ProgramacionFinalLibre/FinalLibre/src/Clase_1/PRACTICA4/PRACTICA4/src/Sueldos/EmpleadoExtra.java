package Sueldos;

public class EmpleadoExtra extends Empleado {
    private int qtyHoras;
    private double extra;

    public EmpleadoExtra(String nombre,double sueldoFijo,int qtyHoras,double extra,int dni) {
        super(nombre,sueldoFijo,dni);
        this.qtyHoras = qtyHoras;
        this.extra = extra;
    }

    public int getQtyHoras() {
        return qtyHoras;
    }

    public void setQtyHoras(int qtyHoras) {
        this.qtyHoras = qtyHoras;
    }

    public void setExtra(double extra){
        this.extra = extra;
    }

    public double getExtra(){
        return extra;
    }
    
    @Override
    public double getSueldo(){
        return super.getSueldo()+(qtyHoras*extra);
    }
    
    
}
