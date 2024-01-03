package Clase_1.PRACTICA2.EstablecimientoDeportivo;

public class Cancha {
    
    private double precio;
    private String nombre;
    private int qtySlots;
    private Turno[] turnos;

    public Cancha(String nombre, double precio,int qtySlots){
        this.precio = precio;
        this.nombre = nombre;
        this.qtySlots=qtySlots;
        turnos = new Turno[qtySlots];
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int qtyTurnosDisponibles(){
        boolean salida = false;
        int i =0;
        while((salida == false)&&(turnos.length>i)){
            if(turnos[i] == null){
                salida = true;
            }else{
                i++;
            }
        }
        if(salida == true){
            return qtySlots-i;
        }else {
            return 0;
        }
    }
    public boolean turnoDisponible(){
        boolean salida = false;
        int i =0;
        while((salida == false)&&(turnos.length>i)){
            if(turnos[i] == null){
                salida = true;
            }else{
                i++;
            }
        }
        if(salida == true){
            return true;
        }else {
            return false;
        }
    }

    public void ocupaSlot(Turno tt){
        boolean salida = false;
        int i =0;
        if(this.qtyTurnosDisponibles() != 0){
            while((salida == false)&&(turnos.length>i)){
                if(turnos[i] == null){
                    salida = true;
                }else{
                    i++;
                }
            }
        }
        if (salida == true){
            turnos[i] = tt;
        }
    }
    
}
