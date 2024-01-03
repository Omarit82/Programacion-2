package Clase_1.PRACTICA2.EstablecimientoDeportivo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Usuario {

    private String name;
    private ArrayList<Turno> turnos;

    /* Constructor */
    public Usuario(String name){
        this.name = name;
        turnos = new ArrayList<Turno>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTurno (Turno tt){
        turnos.add(tt);
    }

    public boolean isSocio(){
        /* Los socios son gratuitos y para serlo es necesario haber reservado un turno 
            al menos 4 veces en los últimos dos meses */
        LocalDate actual = LocalDate.now();
        if(!turnos.isEmpty()){
            int canTurnos = turnos.size();
            /* Chequeo que tenga al menos 4 turnos */
            if (canTurnos >= 4){
                /* Obtengo el 4 turno desde atras para obtener su fecha. */
                Turno tt = turnos.get(canTurnos-4);
                long diasTranscurridos = ChronoUnit.DAYS.between(tt.getFecha(), actual);
                if (diasTranscurridos<60){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return false;
    }

    
}
