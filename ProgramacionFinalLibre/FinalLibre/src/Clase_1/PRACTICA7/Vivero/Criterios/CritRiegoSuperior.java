package Vivero.Criterios;

import Vivero.Planta;

public class CritRiegoSuperior extends Criterio{

    public int valor;

    public CritRiegoSuperior(int valor){
        this.valor = valor;
    }
    
    @Override
    public boolean cumple(Planta planta){
        if(planta.getRequerimientoRiego()>valor){
            return true;
        }else{
            return false;
        }
    }
}
