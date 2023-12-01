package Practica7.Steaming;

public class RentableDos extends Criterio {
    private int anio;
    private String generoUno;
    private String generoDos;

    public RentableDos(String generoUno,String generoDos, int anio){
        this.generoUno = generoUno;
        this.generoDos = generoDos;
        this.anio = anio;
    }

    public boolean cumple (Pelicula p){
        if(p.getAnio()>anio && !(p.getGenero().equals(generoUno)|| p.getGenero().equals(generoDos))){
            return true;
        }else {
            return false;
        }
    }
}
