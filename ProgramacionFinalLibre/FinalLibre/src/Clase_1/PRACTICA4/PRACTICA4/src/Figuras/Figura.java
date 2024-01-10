package Figuras;

public abstract class Figura {
    /*Figura no puede definir perimetro y area porque no sabe que forma tiene. */
    private String nombre;

    public Figura(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public abstract double getArea();
    public abstract double getPerimetro();
}
