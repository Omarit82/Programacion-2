package Composite.Practica;
import java.util.ArrayList;


public class Grupo extends ElementoEmpresa{
    private ArrayList<ElementoEmpresa> elementos;
    private String nombre;
    
    public Grupo(String nombre){
        this.nombre = nombre;
        elementos = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void add(ElementoEmpresa e){
        if(!elementos.contains(e))
        elementos.add(e);
    } 

    public int cantidadEmpleados(){
        int total = 0;
        for (ElementoEmpresa elem : elementos) {
            total += elem.cantidadEmpleados();
        }
        return total;
    }

    public double sueldo(){
        double total = 0;
        for (ElementoEmpresa e : elementos) {
            total += e.sueldo();
        }
        return total;
    }



    public boolean equals(Object obj){
        try {
            Grupo grupo = (Grupo) obj;
            return this.getNombre().equals(grupo.getNombre());
        }catch(Exception e){
            return false;
        }
        
    }
    public ArrayList<Empleado> empleadosCon(String especialidad){
        ArrayList<Empleado> auxiliar = new ArrayList<>();
        for (ElementoEmpresa e : elementos) {
            ArrayList<Empleado> parcial =  e.empleadosCon(especialidad);
            for (Empleado emp : parcial) {
                auxiliar.add(emp);
            }
        }
        return auxiliar;
    }

    @Override
    public String toString() {
        return "Grupo [elementos=" + elementos + ", nombre=" + nombre + "]";
    }
    

}
