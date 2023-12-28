package Clase_1.PRACTICA2.JuegoDadosMesa;

public class Juego {

    /*Atributos del juego */
    private MesaJuego mesa;
    private Cubilete cubilete;
    private int cantidadRondas;
    private int minimo;

    /*Constructor del Juego */

    public Juego(MesaJuego mesa,Cubilete cubilete,int cantidadRondas,int minimo){
        this.mesa = mesa;
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

    public Jugador jugar(){
        for(int i=0; i<cantidadRondas;i++){
            /*Arranca la ronda */
            System.out.println("Ronda: "+(i+1));
            int posicionGanador=0;
            int sumaDados=0;
            for(int j=0;j<mesa.getCantidadJugadores();j++){
                /*Recorre los jugadores de la mesa */
                int lanzamiento = mesa.seleccionarJugador(j).usarCubilete(cubilete);
                System.out.println("Jugador: "+ mesa.seleccionarJugador(j).getNombre()+" - Lanzamiento: "+lanzamiento);
                if(sumaDados < lanzamiento ){
                    posicionGanador = j;
                    sumaDados= lanzamiento;
                }
            }
            System.out.println("__________________");
            if(sumaDados >= minimo){
                System.out.println("Gano la ronda el jugador: "+mesa.seleccionarJugador(posicionGanador).getNombre()+ " con: "+sumaDados+" puntos!");
                mesa.seleccionarJugador(posicionGanador).sumarPunto();
            }
        }

        return this.ganador();
    }
    
    public Jugador ganador(){
        int puntos=0;
        Jugador ganador= null;
        for(int i=0; i< mesa.getCantidadJugadores();i++){
            if((mesa.seleccionarJugador(i).getPuntaje()>puntos)){
                puntos = mesa.seleccionarJugador(i).getPuntaje();
                ganador=mesa.seleccionarJugador(i);
            }
        }
        return ganador;
    }
}
