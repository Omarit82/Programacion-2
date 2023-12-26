package Clase_1.PRACTICA2.GastoPublico;

public class Ciudad {

    private String nombre;
    private int cantidadHabitantes;

    public Ciudad(String nombre,int cantidadHabitantes){
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getCantidadHabitantes(){
        return cantidadHabitantes;
    }
    public void setCantidadHabitantes(int cantidadHabitantes){
        this.cantidadHabitantes = cantidadHabitantes;
    }
    
}
