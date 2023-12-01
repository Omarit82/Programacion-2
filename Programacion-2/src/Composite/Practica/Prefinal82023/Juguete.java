package Composite.Practica.Prefinal82023;

import java.util.ArrayList;

public class Juguete extends ElementoColeccion{
    private String nombre;
    private String marca;
    private int anio;
    private double valorEstimado;
    private double peso;

    public Juguete(String nombre, String marca, int anio, double valorEstimado, double peso) {
        this.nombre = nombre;
        this.marca = marca;
        this.anio = anio;
        this.valorEstimado = valorEstimado;
        this.peso = peso;
    }
    public String getNombre() {
        return nombre;
    }
    public String getMarca() {
        return marca;
    }
   
    public int anio() {
        return anio;
    }
    public double valorEstimado() {
        return valorEstimado + valorEstimado*porcentaje;
    }
    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }
    public double getPeso() {
        return peso;
    }
    
    @Override
    public String toString() {
        return "Juguete [nombre=" + nombre + ", marca=" + marca + ", anio=" + anio + ", valorEstimado=" + valorEstimado+ ", peso=" + peso + "]\n";
    }
    @Override
    public boolean equals(Object obj){
        try {
        Juguete jug = (Juguete) obj;
        if(this.getNombre().equals(jug.getNombre())&&(this.getMarca().equals(jug.getMarca()))&&(this.anio()==jug.anio())&&(this.getPeso()==jug.getPeso())&&(this.valorEstimado()==jug.valorEstimado())){
            return true;
        }else{
            return false;
        }
            
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<ElementoColeccion> elementosTotales(){
        ArrayList<ElementoColeccion> aux = new ArrayList<>();
        aux.add(this);
        return aux;
    }
    
}
