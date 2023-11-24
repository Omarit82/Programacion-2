package Practica6.PuertoCereales;

import java.time.LocalDate;

public class Camion extends ElementoCola{

    private static int id = 1;
    private LocalDate fechaArribo;
    private int idCamion;
    
    public Camion(LocalDate fechaArribo){
        this.fechaArribo = fechaArribo;
        idCamion = id;
        id++;
    }
    
    public LocalDate getFechaArribo() {
        return fechaArribo;
    }

    public void setFechaArribo(LocalDate fechaArribo) {
        this.fechaArribo = fechaArribo;
    }

    public int getIdCamion() {
        return idCamion;
    }

    public void setIdCamion(int idCamion) {
        this.idCamion = idCamion;
    }

    @Override
    public boolean esMayor(ElementoCola e) {
        Camion c = (Camion) e;
        //Tengo que decidir cual es mayor segun la fecha.
        if(this.getFechaArribo().getMonthValue() <= c.getFechaArribo().getMonthValue()){
            return this.getFechaArribo().getDayOfMonth() < c.getFechaArribo().getDayOfMonth();
        }else{
            return false;
        }

    }


    @Override
    public String toString() {
        return "Camion numero: "+idCamion+" | "+" Fecha de arribo al puerto: "+fechaArribo+"\n";
    }
    
}
