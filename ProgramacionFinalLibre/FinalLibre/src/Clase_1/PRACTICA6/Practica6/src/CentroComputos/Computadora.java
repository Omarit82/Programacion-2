package CentroComputos;

public class Computadora extends ElementoCola{
    private int id;
    private static int contador = 1;
    private double velocidad;

    public Computadora(double velocidad){
        this.velocidad = velocidad;
        id = contador;
        contador++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public boolean esMayor(ElementoCola ee) {
        Computadora cc = (Computadora) ee;
        return this.getVelocidad()>cc.getVelocidad();
    }

    
}
