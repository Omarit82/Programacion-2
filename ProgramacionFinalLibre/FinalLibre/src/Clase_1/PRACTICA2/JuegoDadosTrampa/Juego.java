package Clase_1.PRACTICA2.JuegoDadosTrampa;

public class Juego {

    /*Atributos del juego */
    private Jugador jugador1;
    private Jugador jugador2;
    private Cubilete cubilete;
    private int cantidadRondas;
    private int minimo;

    /*Constructor del Juego */

    public Juego(Jugador jugador1,Jugador jugador2,Cubilete cubilete,int cantidadRondas,int minimo){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.cubilete = cubilete;
        this.cantidadRondas = cantidadRondas;
        this.minimo = minimo;
    }

    /*Metodos del juego - Logica */

    public void setCantidadRondas(int cantidadRondas){
        this.cantidadRondas = cantidadRondas;
    }

    public int getCantidadRondas(){
        return cantidadRondas;
    }

    public void jugar(){
        int lanzamiento1=0;
        int lanzamiento2=0;
        for(int i=0; i<cantidadRondas;i++){
            lanzamiento1 = jugador1.usarCubilete(cubilete);
            lanzamiento2 = jugador2.usarCubilete(cubilete);
            if((lanzamiento1>lanzamiento2)&&(lanzamiento1>=minimo)){
                jugador1.sumarPunto();
            }else if((lanzamiento1<lanzamiento2)&&(lanzamiento2>=minimo)){
                jugador2.sumarPunto();
            }
        }
    }
    
    public Jugador ganador(){
        if(jugador1.getPuntaje()>jugador2.getPuntaje()){
            return jugador1;
        }else if(jugador1.getPuntaje()<jugador2.getPuntaje()){
            return jugador2;
        }else{
            return null;
        }
    }
}
