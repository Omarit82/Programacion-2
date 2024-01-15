package Sueldos;

import java.util.ArrayList;

public class Empresa {
    private ArrayList <Empleado> empleados;
    
    public Empresa(){
        empleados =new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
}
