package Sueldos;

public class Principal {
    /*Una empresa de informática posee tres tipos de empleados. Los empleados contratados
    reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados
    por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
    Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
    cantidad de ventas realizadas.
    Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al finalizar
    la semana.
    */
    public static void main(String[] args) {
        Empleado omar = new Empleado("Omar Roselli", 1000, 29555208);
        Empleado male = new EmpleadoExtra("Malena Griffiths", 1000, 10, 5, 31625325);
        Empleado maria = new EmpleadoComicion("Maria de los Angeles", 1000, 2, 5795903);

        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(maria);
        empresa.agregarEmpleado(male);
        empresa.agregarEmpleado(omar);
        empresa.listarEmpleados();

        empresa.agregarVentaEmpleadoComision(maria, 250);
        empresa.agregarVentaEmpleadoComision(omar, 500);
        empresa.agregarVentaEmpleadoComision(maria, 275);

        empresa.listarEmpleados();
        System.out.println(omar.equals(maria));
        
        
    }
}
