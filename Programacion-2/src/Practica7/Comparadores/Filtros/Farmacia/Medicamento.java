package Practica7.Comparadores.Filtros.Farmacia;
import java.util.ArrayList;

public class Medicamento {
    private String nombre;
    private String laboratorio;
    private double precio;
    private ArrayList<String> sintomas;

    public Medicamento(String nombre, String laboratorio, double precio) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
        this.sintomas = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void addSintoma(String sin){
        sintomas.add(sin);
    }    
    
    public boolean trataSintoma(String nombre){
        return this.sintomas.contains(nombre);
    }
}
