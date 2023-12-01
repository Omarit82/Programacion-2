package Composite.Practica.Prefinal82023;
import java.util.ArrayList;

public class Coleccion extends ElementoColeccion{
    private ArrayList<ElementoColeccion> coleccion;
    private String nombreColeccion;
    

    public Coleccion(String nombre){
        coleccion = new ArrayList<>();
        nombreColeccion = nombre;
    }
    public void setNombreColeccion(String nombre){
        nombreColeccion = nombre;
    }
    
    public String getNombreColeccion(){
        return nombreColeccion;
    }

    public void add(ElementoColeccion e){
        coleccion.add(e);
    }
    
    public ArrayList<ElementoColeccion> elementosTotales(){
        ArrayList<ElementoColeccion> auxiliar = new ArrayList<>();
        for (ElementoColeccion elem : coleccion) {
            auxiliar.addAll(elem.elementosTotales());
        }
        return auxiliar;
    }

    public int anio(){
        ArrayList<ElementoColeccion> aux = elementosTotales();
        int total=0;
        for (ElementoColeccion elemento : aux) {
            total+=elemento.anio();
        }
        return (int) total/aux.size();
    }

    public double valorEstimado(){
        ArrayList<ElementoColeccion> aux =  elementosTotales();
        double total = 0;
        for (ElementoColeccion elemento : aux) {
            total += elemento.valorEstimado();
        }
        return total;
    }

    public boolean contieneElemento(ElementoColeccion e){
        return coleccion.contains(e);
    }

    public ArrayList<ElementoColeccion> buscar(Criterio criterio){
        ArrayList<ElementoColeccion> cumplen = new ArrayList<>();
        ArrayList<ElementoColeccion> auxiliar = elementosTotales();
        for (ElementoColeccion item : auxiliar) {
            if(criterio.cumple(item)){
                cumplen.add(item);
            }
        }
        return cumplen;
    }

}
