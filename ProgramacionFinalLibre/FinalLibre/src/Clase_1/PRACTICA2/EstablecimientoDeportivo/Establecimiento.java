package Clase_1.PRACTICA2.EstablecimientoDeportivo;

import java.util.ArrayList;

public class Establecimiento {
    
    /*Atributos */
    private Cancha[] futbol;
    private Cancha[] paddle;
    private ArrayList<Socio> socios;

    /*Constructor */
    public Establecimiento(int qtyFutbol, int qtyPaddle){
        futbol = new Cancha[qtyFutbol];
        paddle = new Cancha[qtyPaddle];
        socios = new ArrayList<Socio>();
    }

    /* Metodos */

    public void addSocio(Socio ss){
        if(ss != null){
            socios.add(ss);
        }
    }

}
