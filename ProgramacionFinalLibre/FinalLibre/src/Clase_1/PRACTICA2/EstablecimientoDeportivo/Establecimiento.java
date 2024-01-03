package Clase_1.PRACTICA2.EstablecimientoDeportivo;

import java.util.ArrayList;

public class Establecimiento {
    
    /*Atributos */
    private ArrayList<Cancha> futbol;
    private ArrayList<Cancha> paddle;
    private int descuento = 10;

    /*Constructor */
    public Establecimiento(){
        futbol = new ArrayList<Cancha>();
        paddle = new ArrayList<Cancha>();
    }

    /* Metodos */
    public void addCanchaFutbol(Cancha cc){
        futbol.add(cc);
    }
    public void addCanchaPaddle(Cancha pd){
        paddle.add(pd);
    }

    public void setdescuento(int desc){
        descuento = desc;
    }

    public int getDescuento(){
        return descuento;
    }
    /* Genero una nueva reserva pasandole un usuario ( agregandolo al array si no existe), 
    le asigno una cancha y le cobro.*/
    public void reserva(Turno turno, Cancha cancha){
        if(cancha.turnoDisponible()){
            if(turno.getUsuario().isSocio()){
                /*Cargar el turno al usuario. */
                cancha.ocupaSlot(turno);
                turno.getUsuario().addTurno(turno);
                /*Se aplica el descuento */
                System.out.println("Es socio, se aplica el descuento de: "+descuento+"%");
                System.out.println("Abona: "+(((double)cancha.getPrecio())-(((double)cancha.getPrecio())*descuento/100)));
            }else{
                cancha.ocupaSlot(turno);
                turno.getUsuario().addTurno(turno);
                System.out.println("No es socio, no se aplica el descuento de: "+descuento+"%");
                System.out.println("Abona: "+cancha.getPrecio());
            }
        }else{
            System.out.println("No hay turno disponible.");
        }
       
    }




}
