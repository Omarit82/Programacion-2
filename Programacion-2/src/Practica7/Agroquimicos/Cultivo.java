package Practica7.Agroquimicos;
import java.util.ArrayList;

public class Cultivo {
   /*Un cultivo, tiene un nombre y enfermedades frecuentes. */
    private String nombre;
    private ArrayList<Enfermedad> enfermedades;

    public Cultivo(String nombre){
        this.nombre = nombre;
        enfermedades = new ArrayList<Enfermedad>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEnfermedad(Enfermedad e){
        enfermedades.add(e);
    }

    public boolean tieneEnfermedad(Enfermedad e){
        if(enfermedades.contains(e)){
            return true;
        }else{
            return false;
        }
    }

    public boolean equals(Cultivo c){
        return this.getNombre().equals(c.getNombre());
    }

    public boolean productoUtil(Producto p){
        //Debo indicar si el producto quimico pasado por parametro p, es util para las enfermedades del cultivo.
        if(p.estaDesaconsejado(this)){
            return false;
        }else{
            //Si no esta desaconsejado. Debo obtener las enfermedades para las cuales el producto es efectivo.
            //Recorro el arreglo de enfermedades y me quedo con un Array auxiliar de las enfermedades que el producto quimico ataca.
            //Si ese arreglo queda vacio, el producto no sirve - False- Si no esta vacio - True-

            return true;
        }
    }
}
