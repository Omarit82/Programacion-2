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
        /*Debo indicar si el producto quimico pasado por parametro p,
         es util para las enfermedades del cultivo.*/
        if(p.estaDesaconsejado(this)){
            return false;
        }else{
            for (Enfermedad enfermedad : enfermedades) {
                if (p.cura(enfermedad)){
                    return true;
                }
            }
            return false;
        }
    }
}
