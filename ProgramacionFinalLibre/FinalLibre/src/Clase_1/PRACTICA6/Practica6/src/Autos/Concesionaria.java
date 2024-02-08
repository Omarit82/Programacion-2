package Autos;

import java.util.ArrayList;
import java.util.Collections;

import Autos.Comparadores.Comparador;
import Autos.Criterios.Criterio;

public class Concesionaria {
    private String name;
    private ArrayList<Auto> autos;
    
    public Concesionaria(String name){
        this.name = name;
        autos = new ArrayList<>();
    }

    /*Agrega un auto */

    public void addAuto(Auto a1){
        autos.add(a1);
    }

    public String getName(){
        return name;
    }
    /*Comparador */
    public ArrayList<Auto> comparadores (Comparador comparador){
        ArrayList<Auto> auxiliar = new ArrayList<>();
        Collections.sort(autos, comparador);
        auxiliar = autos;
        return auxiliar;
    }
  
    /* Criterio de busqueda */
    public ArrayList<Auto> busqueda(Criterio criterio){
        ArrayList<Auto> aux = new ArrayList<>();
        for (int i=0;i < autos.size(); i++){
            if(criterio.cumple(autos.get(i))){
                aux.add(autos.get(i));
            }
        }
        return aux;
    }

}
