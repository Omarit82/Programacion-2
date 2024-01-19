package Facturacion;

public class EmpleadoBonos extends Vendedor {
    private double bono;
    private int vtasMinimas;

    public EmpleadoBonos(String nombre, String apellido, int dni, double sueldo, int porcentaje,double bono,int vtasMinimas) {
        super(nombre, apellido, dni, sueldo, porcentaje);
        this.bono = bono;
        this.vtasMinimas = vtasMinimas;
        
    }
    
    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public int getVtasMinimas() {
        return vtasMinimas;
    }

    public void setVtasMinimas(int vtasMinimas) {
        this.vtasMinimas = vtasMinimas;
    }
    
    @Override
    public double getSueldo(){
        if(super.cantidadVentas()>=vtasMinimas){
            return super.getSueldo()+bono;
        }else{
            return super.getSueldo();
        }
        
    }
}
