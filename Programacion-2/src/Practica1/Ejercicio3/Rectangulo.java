package Practica1.Ejercicio3;

public class Rectangulo {
    /**
    *  Implementar la clase Rectángulo.
        Para esta clase es necesario definir el rectángulo utilizando los puntos como vértices. Se
        trabajará con Rectángulos cuyos lados estén paralelos a los ejes.
        Nota. Definir la estructura que deber poseer un rectángulo y en base a esto implementar
        los atributos de la clase.
    */
    //Atributos
    
    private double pto1coorX;
    private double pto1coorY;
    private double pto2coorX;
    private double pto2coorY;
   // private Punto_geometrico pto1 = new Punto_geometrico(pto1coorX,pto1coorY);
    //private Punto_geometrico pto2 = new Punto_geometrico(pto2coorX,pto2coorY);
    

    //constructor
    public Rectangulo(double pto1coorX, double pto1coorY, double pto2coorX, double pto2coorY) {
        setPto1coorX(pto1coorX);
        setPto1coorY(pto1coorY);
        setPto2coorX(pto2coorX);
        setPto2coorY(pto2coorY);
    }

    // Metodos: Setters & Getters
    public double getPto1coorX() {
        return pto1coorX;
    }
    public void setPto1coorX(double pto1coorX) {
        this.pto1coorX = pto1coorX;
    }
    public double getPto1coorY() {
        return pto1coorY;
    }
    public void setPto1coorY(double pto1coorY) {
        this.pto1coorY = pto1coorY;
    }
    public double getPto2coorX() {
        return pto2coorX;
    }
    public void setPto2coorX(double pto2coorX) {
        this.pto2coorX = pto2coorX;
    }
    public double getPto2coorY() {
        return pto2coorY;
    }
    public void setPto2coorY(double pto2coorY) {
        this.pto2coorY = pto2coorY;
    }

    /** La funcionalidad que debe proveer un rectángulo es la siguiente
        ● Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
        Y.
        ● Calcular el Área del rectángulo.
        ● Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
        iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
        del mismo es mayor que la del otro.
        ● Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
        propiedades para que sea un cuadrado.
        ● Determinar el largo del lado superior.
        ● Determinar si está acostado o parado (si el alto es más que el ancho).
     */

    public void setDesplazamiento (double deltaX, double deltaY){
        setPto1coorX(pto1coorX+deltaX);
        setPto1coorY(pto1coorY+deltaY);
        setPto2coorX(pto2coorX+deltaX);
        setPto2coorY(pto2coorY+deltaY);
    }
    
}
