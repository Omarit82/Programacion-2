package Sombrero;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String>cualidades;
    private ArrayList<Alumno>familiares;
    
    public Alumno(String nombre) {
        this.nombre = nombre;
        cualidades = new ArrayList<>();
        familiares = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esFamiliar(Alumno alumno){
        boolean familiar = true;
        for (Alumno al : familiares) {
            if(!familiares.contains(al)){
                familiar = false;
            }
        }
        return familiar;
    }

    public boolean tieneCualidad(String cualidad){
        cualidad = cualidad.toLowerCase();
        if (cualidades.contains(cualidad)){
            return true;
        }else{
            return false;
        }
    }

    public void agregarCualidad(String cualidad){
        cualidad = cualidad.toLowerCase();
        if(!cualidades.contains(cualidad)){
            cualidades.add(cualidad);
        }

    }
    @Override
    public boolean equals(Object obj){
        try {
            Alumno auxiliar = (Alumno) obj;
            if(auxiliar.getNombre().equals(this.getNombre())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        
    }

    @Override
    public String toString(){
        return "Nombre del alumno: "+this.getNombre();
    }
}
