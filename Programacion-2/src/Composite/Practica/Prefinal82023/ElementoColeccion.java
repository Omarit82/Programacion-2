package Composite.Practica.Prefinal82023;
import java.util.ArrayList;

public abstract class ElementoColeccion {
    protected static double porcentaje = 0.1;

    public abstract ArrayList<ElementoColeccion> elementosTotales();  
    public abstract int anio();
    public abstract double valorEstimado();
}
