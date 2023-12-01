package Composite.Practica;
import java.util.ArrayList;
public abstract class ElementoEmpresa {
    
    /* Tengo que determinar la cantidad total de empleados.*/
    public abstract int cantidadEmpleados();
    public abstract double sueldo();
    public abstract ArrayList<Empleado> empleadosCon(String especialidad);
}
