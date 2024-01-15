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

    public void removerEmpleadoDni(int dni){
        int i=0;
        boolean encontro = false;
        while(!encontro && (i<empleados.size())){
            if(empleados.get(i).getDni() == dni){
                encontro = true;
                System.out.println("Eliminado el empleado: "+empleados.get(i).getDni());
                empleados.remove(i);
            }
            i++;
        }
        if(i == empleados.size()){
            System.out.println("No se encontro el empleado con dni: "+dni);
        }

    }
}
