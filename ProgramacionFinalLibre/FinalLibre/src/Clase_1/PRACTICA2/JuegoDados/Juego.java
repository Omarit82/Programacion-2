package Clase_1.PRACTICA2.JuegoDados;

public class Juego {
    private int cantidadRondas;
    private int minimoPuntos;
    private Jugador j1;
    private Jugador j2;
    private Dado d1;
    private Dado d2;

    public Juego(int cantidadRondas,int minimo,Jugador j1,Jugador j2,Dado d1, Dado d2){
        minimoPuntos = minimo;
        this.cantidadRondas = cantidadRondas;
        this.j1 = j1;
        this.j2 = j2;
        this.d1 = d1;
        this.d2 = d2;
    }

    /* Logica del juego. */

    public Jugador ganador(){
        if(j1.getPuntos()>j2.getPuntos()){
            return j1;
        }else if(j1.getPuntos()<j2.getPuntos()){
            return j2;
        }else{
            return null;
        }
    }

    public Jugador jugar(){
        int lanzamiento1;
        int lanzamiento2;

        for (int i = 0; i<cantidadRondas ; i++){
            lanzamiento1 = j1.tirarDados(d1, d2);
            lanzamiento2 = j2.tirarDados(d1, d2);
            
            if((lanzamiento1>lanzamiento2)&&(lanzamiento1>minimoPuntos)){
                j1.sumarPunto();
            }else if((lanzamiento1<lanzamiento2)&&(lanzamiento2>minimoPuntos)){
                j2.sumarPunto();
            }
        }

        return this.ganador();
    }
}
