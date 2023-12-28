package Clase_1.PRACTICA2.JuegoDadosMesa;

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
            System.out.println("Lanzamiento: "+(i+1)+" : "+lanzamiento);
            suma += lanzamiento;
        }
        System.out.println("_______________________");
        return suma;
    }

    public void setDadoEnPos(int posicion, Dado d1){
        if((posicion>=0)&&(posicion < dados.length)){
            dados[posicion] = d1;
            System.out.println("Dado numero: "+(posicion+1)+" reemplazado");
        }
    }
    
}
