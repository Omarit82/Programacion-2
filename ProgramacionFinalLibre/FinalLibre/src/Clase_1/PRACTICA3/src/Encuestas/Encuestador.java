package Encuestas;

public class Encuestador extends Persona{
    /*Atributos */
    private int encuestasRealizadas;
    private double sueldoFijo;
    public static final double PLUS = 25;

    /*Constructor */
    public Encuestador(String nombre,int dni, double sueldoFijo){
        super(nombre, dni);
        this.sueldoFijo = sueldoFijo;
    }

    public int getEncuestasRealizadas(){
        return encuestasRealizadas;
    }

    public void hacerEncuesta(){
        this.encuestasRealizadas++;
    }

    public double getSueldo(){
        return sueldoFijo+(encuestasRealizadas*25);
    }


    
}
