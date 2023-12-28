package Clase_1.PRACTICA2.JuegoDadosMesa;

public class Jugador {

    /*Atributos del Jugador */
    private String nombre;
    private int puntaje;

    /*Constructor del jugador */
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    /*Metodos del Jugador */
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
        //System.out.println(this.getNombre());
        return cub.lanzaDados();
    }
    
}
