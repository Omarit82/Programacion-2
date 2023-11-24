package Practica6.PuertoCereales;

public class Barco extends ElementoCola {
    private int capacidad;
    private int idBarco;
    private static int id=101;
    
    public Barco(int capacidad){
        this.capacidad = capacidad; 
        idBarco = id;
        id++;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getIdBarco() {
        return idBarco;
    }

    @Override
    public boolean esMayor(ElementoCola b) {
        Barco barco = (Barco) b;
        return this.getCapacidad() > barco.getCapacidad();
    }

    @Override
    public String toString() {
       return "Barco id: "+idBarco+" | "+"Capacidad de carga: "+capacidad+"\n";
    }
    
    
}
