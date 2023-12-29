package Clase_1.PRACTICA2.JuegoDadosTrampa;

public class JugadorTramposo extends Jugador{

    private Dado d1;
    private Dado d2;

    public JugadorTramposo(String nombre){
        super(nombre);
        d1 = new DadoCargado(6, 6, 0.7);
        d2 = new DadoCargado(6, 5, 0.7);

    }
    
    public int usarCubilete(Cubilete cub){
        System.out.println(this.getNombre());
        Dado d3 = cub.getDadoEnPos(0);
        Dado d4 = cub.getDadoEnPos(1);
        cub.setDadoEnPos(1, d2); 
        cub.setDadoEnPos(0, d1);
        int lanzamiento = cub.lanzaDados();
        cub.setDadoEnPos(0, d3);
        cub.setDadoEnPos(1, d4);
        return lanzamiento;
    }

}
