package Practica7.Agroquimicos;
import java.util.ArrayList;

public class Producto {
    /*Un producto químico tiene asociado un nombre, un conjunto cultivos no recomendados y sintomas que trata */
    private String nombre;
    private ArrayList<Cultivo>cultivosDesaconsejados;
    private ArrayList<String>sintomasQueTrata;

    public Producto(String nombre){
        cultivosDesaconsejados = new ArrayList<Cultivo>();
        sintomasQueTrata = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCultivoDesaconsejado(Cultivo c){
        cultivosDesaconsejados.add(c);
    }
    public void addSinotmaQueTrata(String e){
        sintomasQueTrata.add(e);
    }

    public boolean estaDesaconsejado(Cultivo c){
        if (cultivosDesaconsejados.contains(c)){
            return true;
        }else{
            return false;
        }

    }
}
