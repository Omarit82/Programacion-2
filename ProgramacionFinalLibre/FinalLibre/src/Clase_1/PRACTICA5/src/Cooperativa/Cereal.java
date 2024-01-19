package Cooperativa;

import java.util.ArrayList;

public class Cereal {
    private ArrayList<String>mineralesRequeridos;

    public Cereal(){
        mineralesRequeridos = new ArrayList<>();
    }

    public void agregarMineral(String mineral){
        mineral = mineral.toLowerCase();
        mineralesRequeridos.add(mineral);
    }

    public boolean tieneMineral (String mineral){
        mineral = mineral.toLowerCase();
        return mineralesRequeridos.contains(mineral);
    }

    public void listaMinerales(){
        for (String mineral : mineralesRequeridos) {
            System.out.println(mineral+"\n");
        }
    }

    public boolean puedeSembrarse(Lote lote){
        boolean puede = true;
        /*for (String min : mineralesRequeridos) {  Seria mejor con un while que corte ante el primero que no cumpla.
            if(!lote.tieneMineral(min)){
                puede = false;
            }
        }*/
        int i = 0;
        while (puede && i< mineralesRequeridos.size()){
            if(!lote.tieneMineral(mineralesRequeridos.get(i))){
                puede = false;
                System.out.println("El lote no tiene: "+mineralesRequeridos.get(i));
            }else{
                i++;
            }
        }
        return puede;
    }

    public ArrayList<String> minPresentes(){
        ArrayList<String> mineralesPresentes = new ArrayList<>();
        mineralesPresentes = mineralesRequeridos;
        return mineralesPresentes;
    }
}
