package Clase_1.PRACTICA1.ElementoGeometrico;

public class PuntoGeometrico {
    
    /* Atributos */

    private double valorX = 0;
    private double valorY = 0;

    /* Constructores */

    public PuntoGeometrico(double valorX,double valorY){
        this.valorX = valorX;
        this.valorY = valorY;
    }

    /* Metodos */

    public double getValorX(){
        return valorX;
    }

    public void setValorX(double valorX){
        this.valorX = valorX;
    }

    public double getValorY() {
        return valorY;
    }

    public void setValorY(double valorY) {
        this.valorY = valorY;
    }

    public void desplazarPunto(double deltaX, double deltaY){
        valorX += deltaX;
        valorY += deltaY;
    }

    public double distanciaEuclidea(double xPrima, double yPrima){
        return Math.sqrt(Math.pow((valorX-xPrima), 2)+Math.pow((valorY-yPrima), 2));
    }
    
    public String toString(){
        return "("+valorX+" , "+valorY+")";
    }
}
