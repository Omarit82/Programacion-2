package Registro;

import java.util.ArrayList;

public class Jerarquico extends Empleado{
    
    private ArrayList<Empleado> empleados;

    public Jerarquico(String nombre, String apellido, int edad, int legajo, double sueldo) {
        super(nombre, apellido, edad, legajo, sueldo);
        empleados = new ArrayList<Empleado>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    @Override
    public String toString(){
        String auxiliar = super.toString();
        String aux ="";
        for (Empleado empleado : empleados) {
            aux += empleado.getApellido()+", "+empleado.getNombre()+"\n";
        }
        return auxiliar+aux;
    }
    
}
