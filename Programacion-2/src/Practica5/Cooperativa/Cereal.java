package Practica5.Cooperativa;
import java.util.ArrayList;
public class Cereal {
    private ArrayList<String>minerales;
    private String nombre;

    public Cereal(String nombre){
        this.nombre = nombre;
        minerales = new ArrayList<String>();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void addMineralRequerio(String min){
        minerales.add(min);
    }

    public boolean checkRequerimiento(Lote l){
        for (String min : minerales) {
            if(!l.contieneMineral(min)){
                return false;
            }
        }
        return true;
    }

}
