package CandyCrush;
import java.util.ArrayList;

import CandyCrush.Filtros.Filtro;
public class Tablero {
    private int puntajeMinimo;
    private ArrayList<Ficha> fichas;


    public Tablero(int puntajeMinimo){
        this.puntajeMinimo = puntajeMinimo;
        fichas = new ArrayList<>();
    }

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }

    public double getDificultad() {
        int fortalezas = 0;
        int poderDestruccion = 0;
        for (Ficha ficha : fichas) {
            fortalezas += ficha.getFortaleza();
            poderDestruccion += ficha.getPoderDestruccion();
        }
        return (double) fortalezas / poderDestruccion;
    }

    public void agregarFicha(Ficha ficha){
        fichas.add(ficha);
    }

    public ArrayList<Ficha> filtro(Filtro filtro){
        ArrayList<Ficha> aux = new ArrayList<>();
        for (Ficha ficha : fichas) {
            if(filtro.cumple(ficha)){
                aux.add(ficha);
            }
        }
        return aux;
    }
}
