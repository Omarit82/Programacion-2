package Facturacion;

public class Principal {

    public static void main(String[] args) {
        Empresa deitres = new Empresa();
        Empleado omar = new Empleado("Omar", "Roselli", 29555208, 15000);
        Vendedor male = new Vendedor("Malena", "Griffiths", 31625325, 17000, 5);
        EmpleadoBonos tres = new EmpleadoBonos("Carlos", "Perez", 124567, 11000, 5, 5000, 3);
        deitres.agregarEmpleado(tres);
        deitres.agregarEmpleado(omar);
        deitres.agregarEmpleado(male);

        male.agregarVenta(150);
        tres.agregarVenta(34);
        tres.agregarVenta(23);
        tres.agregarVenta(450);
        System.out.println( deitres.totalSueldos());
       
    }
    
}
