package Farmacia;

import java.util.ArrayList;

public class Medicamento {

    private String nombre;
    private String laboratorio;
    private double precio;
    private ArrayList<String> sintomas;

    public Medicamento(String nombre, String laboratorio, double precio){
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
        sintomas= new ArrayList<>();
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setLaboratorio(String laboratorio){
        this.laboratorio = laboratorio;
    }

    public String getLaboratorio(){
        return laboratorio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio (){
        return precio;
    }
    /*Manejo del array */
    public void agregarSintoma(String sintoma){
        sintoma = sintoma.toLowerCase();
        if(!sintomas.contains(sintoma)){
            sintomas.add(sintoma);
        }
    }

    @Override
    public String toString() {
        return "Medicamento Nombre=" + nombre + ", Laboratorio=" + laboratorio + ", Precio=" + precio + ", Sintomas="
                + sintomas + "\n";
    }

    
}
