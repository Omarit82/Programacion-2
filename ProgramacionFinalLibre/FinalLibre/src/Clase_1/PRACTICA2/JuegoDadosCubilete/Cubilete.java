package Clase_1.PRACTICA2.JuegoDadosCubilete;

public class Cubilete {

    private int cantidadDados;
    private Dado[] dados;

    public Cubilete(int cantidadDados,int cantidadCaras){
        this.cantidadDados = cantidadDados;
        dados = new Dado[cantidadDados];
        for ( int i =0 ; i<dados.length;i++){
            dados[i] = new Dado(cantidadCaras);
        }
    }

    public int getCantidadDados(){
        return cantidadDados;
    }
    public int lanzaDados(){
        int suma=0;
        int lanzamiento=0;
        for (int i=0;i<dados.length;i++){
            lanzamiento = dados[i].tirar();
            suma += lanzamiento;
        }
        return suma;
    }
    
}
