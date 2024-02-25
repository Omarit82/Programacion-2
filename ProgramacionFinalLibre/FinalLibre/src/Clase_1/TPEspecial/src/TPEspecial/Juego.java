package TPEspecial;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Mazo mazoCartas;
    private int turno;

    public Juego(Jugador jugador1,Jugador jugador2,Mazo mazoCartas){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.mazoCartas = mazoCartas;
        turno=1;
    }

    public void repartirCartas(){
        int qty = mazoCartas.cantidadCartas();
        for (int i=0; i<qty; i++){
            if(i%2!=0){
                jugador1.addCartaMazoJugador(mazoCartas.repartirCarta());
            }else{
                jugador2.addCartaMazoJugador(mazoCartas.repartirCarta());
            }
        }
    }

    public void jugarMano(){
        /*--Defino a quien le toca jugar--*/
        if(turno%2 != 0){
            /*--Turno del jugador 1--*/
            Carta uno = jugador1.jugarCarta();
            int index = uno.seleccionAtributo();
            String nombreAtributo = uno.getAtributo(index).getNombre();
            System.out.println("El jugador "+jugador1.getNombreJugador()+" selecciona: "+nombreAtributo);
            System.out.println("Jugador "+jugador1.getNombreJugador()+" juega: "+uno.getNombre()+" con "+nombreAtributo+" : "+uno.getAtributo(index).getValorNumerico());
            Carta dos = jugador2.jugarCarta();
            System.out.println("Jugador "+jugador2.getNombreJugador()+" juega: "+dos.getNombre()+" con "+nombreAtributo+" : "+dos.getAtributo(index).getValorNumerico());
           
            if(uno.getAtributo(index).getValorNumerico() > dos.getAtributo(index).getValorNumerico()){
                /*--Gano el jugador Uno--*/
                System.out.println("Ronda para el jugador: "+jugador1.getNombreJugador());
                jugador1.addCartaMazoJugador(uno);
                jugador1.addCartaMazoJugador(dos);
            }else if(uno.getAtributo(index).getValorNumerico() < dos.getAtributo(index).getValorNumerico()){
                /*--Gano el jugador Dos--*/
                System.out.println("Ronda para el jugador: "+jugador2.getNombreJugador());
                jugador2.addCartaMazoJugador(uno);
                jugador2.addCartaMazoJugador(dos);
                turno++;
            }else{
                /*--Caso de empate--*/
                System.out.println("¡Empate!");
                jugador1.addCartaMazoJugador(uno);
                jugador2.addCartaMazoJugador(dos);
            }
        }else{
            /*--Turno del jugador 2--*/
            Carta dos = jugador2.jugarCarta();
            int index = dos.seleccionAtributo();
            String nombreAtributo = dos.getAtributo(index).getNombre();
            System.out.println("El jugador "+jugador2.getNombreJugador()+" selecciona: "+nombreAtributo);
            System.out.println("Jugador "+jugador2.getNombreJugador()+" juega: "+dos.getNombre()+" con "+nombreAtributo+" : "+dos.getAtributo(index).getValorNumerico());
            Carta uno = jugador1.jugarCarta();
            System.out.println("Jugador "+jugador1.getNombreJugador()+" juega: "+uno.getNombre()+" con "+nombreAtributo+" : "+uno.getAtributo(index).getValorNumerico());

            if(uno.getAtributo(index).getValorNumerico() > dos.getAtributo(index).getValorNumerico()){
                /*--Gano el jugador Uno--*/
                System.out.println("Ronda para el jugador: "+jugador1.getNombreJugador());
                jugador1.addCartaMazoJugador(uno);
                jugador1.addCartaMazoJugador(dos);
                turno++;
            }else if(uno.getAtributo(index).getValorNumerico() < dos.getAtributo(index).getValorNumerico()){
                /*--Gano el jugador Dos--*/
                System.out.println("Ronda para el jugador: "+jugador2.getNombreJugador());
                jugador2.addCartaMazoJugador(uno);
                jugador2.addCartaMazoJugador(dos);
            }else{
                /*--Caso de empate--*/
                System.out.println("¡Empate!");
                jugador1.addCartaMazoJugador(uno);
                jugador2.addCartaMazoJugador(dos);
            }
        }
        System.out.println(jugador1.getNombreJugador()+" tiene "+jugador1.getCantidadCartas()+" cartas,\n"+
                           jugador2.getNombreJugador()+" tiene "+jugador2.getCantidadCartas()+" cartas.");
    }
    

    public void jugar(int rondasMaximas){
        System.out.println("Inicia el juego: ");
        repartirCartas();
        /*--Contador de rondas--*/
        int contadorRondas = 1;
    
        while(contadorRondas<= rondasMaximas && (jugador1.getCantidadCartas()!=0 )&&(jugador2.getCantidadCartas()!=0)){
            System.out.println("-------------------Ronda: "+(contadorRondas)+" ---------------");
            jugarMano();
            contadorRondas++;
        }

        /*--Resolucion e impresion del ganador--*/
        if(jugador1.getCantidadCartas()>jugador2.getCantidadCartas()){
            System.out.println("Gano el jugador: "+jugador1.getNombreJugador()+", con :"+jugador1.getCantidadCartas()+" cartas");
        }else if(jugador2.getCantidadCartas()>jugador1.getCantidadCartas()){
            System.out.println("Gano el jugador: "+jugador2.getNombreJugador()+", con :"+jugador2.getCantidadCartas()+" cartas");
        }else{
            System.out.println("Empate!");
        }
    }
}
