package Clase_1.PRACTICA2.JuegoDadosCubilete;

public class Jugador {
    private String nombre;
    private int puntaje;

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public int getPuntaje(){
        return puntaje;
    }

    public void sumarPunto(){
        puntaje++;
    }

    public int usarCubilete(Cubilete cub){
        return cub.lanzaDados();
    }
    
}
