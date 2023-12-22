package Clase_1.PRACTICA1.ElementoGeometrico;

public class RectanguloV2 {

    /* Atributos */

    private PuntoGeometrico vertice;
    private double lado1;
    private double lado2;

    /* Constructor */

    public RectanguloV2(PuntoGeometrico vertice, double lado1, double lado2){
        this.vertice = vertice;
        setLado1(lado1);
        setLado2(lado2);
    }

    /* Getters & Setters */

    public PuntoGeometrico getVertice() {
        return vertice;
    }
    public void setVertice(PuntoGeometrico vertice) {
        this.vertice = vertice;
    }
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        if(lado1 != 0){
            this.lado1 = lado1;
        }else{
            this.lado1 = 1;
        }
        
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        if(lado2 != 0){
            this.lado2 = lado2;
        } else {
            this.lado2 = 1;
        }
    }

        
}
