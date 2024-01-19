package Cooperativa;

import java.util.ArrayList;

public class Lote {
    private int superficie;
    private ArrayList <String> minerales;

    public Lote(int superficie){
        this.superficie = superficie;
        minerales = new ArrayList<>();
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    public void agregarMineral(String mineral){
        mineral = mineral.toLowerCase();
        minerales.add(mineral);
    }

    public boolean tieneMineral(String mineral){
        mineral = mineral.toLowerCase();
        return minerales.contains(mineral);
    }

    public ArrayList<String> minPresentes(){
        ArrayList<String> mineralesPresentes = new ArrayList<>();
        mineralesPresentes = minerales;
        return mineralesPresentes;
    }
}
