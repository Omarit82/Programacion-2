package Futbol5;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuotaPaga;
    private ArrayList<Alquiler> alquileres;

    public Socio(String nombre, String apellido, int edad, boolean cuotaPaga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuotaPaga = cuotaPaga;
        alquileres = new ArrayList<>();
    }

    public void addAlquiler(Alquiler nuevoAlquiler){
        alquileres.add(nuevoAlquiler);
    }

    public int alquiloCancha(int idCancha){
        int qty = 0;
        for (Alquiler alquiler : alquileres) {
            if(alquiler.getIdCancha() == idCancha){
                qty++;
            }
        }
        return qty;
    }

    public boolean pagoCancha(int costo){
        boolean pago = false;
        int i=0;
        while(!pago && i<alquileres.size()){
            if(alquileres.get(i).getPrecio() > costo){
                pago = true;
            }

            i++;
        }
        return pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCuotaPaga() {
        return cuotaPaga;
    }

    public void setCuotaPaga(boolean cuotaPaga) {
        this.cuotaPaga = cuotaPaga;
    }
    

    
}
