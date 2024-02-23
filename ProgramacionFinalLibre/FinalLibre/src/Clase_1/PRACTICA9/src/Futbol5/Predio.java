package Futbol5;

import Futbol5.Comparadores.*;
import Futbol5.Filtros.*;
import java.util.ArrayList;
import java.util.Collections;

public class Predio {
    private ArrayList<Socio> socios;
    
    public Predio(){
        socios = new ArrayList<>();
    }

    public void addSocio(Socio socio){
        socios.add(socio);
    }

    public ArrayList<Socio> obtenerListado(Filtro ff, Comparador com){
        ArrayList<Socio> retorno = new ArrayList<>();
        /*Agrego al array todos los socios que cumplen el filtro */
        for (Socio socio : socios) {
            if(ff.cumple(socio)){
                retorno.add(socio);
            }
        }
        /*Comparo los socios del array para devolverlo ordenado. */
        Collections.sort(retorno, com);
        return retorno;
    }
}
