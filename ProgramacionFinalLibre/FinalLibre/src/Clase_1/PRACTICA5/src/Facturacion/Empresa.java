package Facturacion;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa(){
        empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public double totalSueldos(){
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.getSueldo();
        }
        return total;
    }
}
