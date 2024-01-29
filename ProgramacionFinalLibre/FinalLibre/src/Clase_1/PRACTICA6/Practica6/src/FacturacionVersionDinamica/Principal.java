package FacturacionVersionDinamica;

public class Principal {

    public static void main(String[] args) {
        Empresa deitres = new Empresa();
       
        Empleado omar = new Empleado("Omar", "Roselli", 29555208, 15000);

        deitres.agregarEmpleado(omar);
        FormaPago fp = new FormaPagoExtra(15000, 25000, 5);
        omar.setFormaPago(fp);
        
        System.out.println( deitres.totalSueldos());
       
    }
    
}
