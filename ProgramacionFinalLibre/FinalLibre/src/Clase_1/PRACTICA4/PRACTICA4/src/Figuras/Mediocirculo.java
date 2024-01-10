package Figuras;

public class Mediocirculo extends Circulo{
    private double radio;

    public Mediocirculo(double radio){
        super(radio);
        this.setNombre("Medio Circulo");
    }

    public double getArea(){
        return super.getArea()/2;
    }

    public double getPerimetro(){
        return (radio*2)+super.getPerimetro()/2;
    }
}
