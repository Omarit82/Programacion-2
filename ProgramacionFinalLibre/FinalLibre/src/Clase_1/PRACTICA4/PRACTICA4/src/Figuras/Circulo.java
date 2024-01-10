package Figuras;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;
    }

    public double getArea(){
        return radio*radio + Math.PI;
    }

    public double getPerimetro() {
        return 2*Math.PI*radio;        
    }

    
}
