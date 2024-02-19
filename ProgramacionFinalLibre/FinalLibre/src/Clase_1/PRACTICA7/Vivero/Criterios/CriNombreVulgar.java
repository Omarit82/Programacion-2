package Vivero.Criterios;

import Vivero.Planta;

public class CriNombreVulgar extends Criterio{
    private String nombreVulgar;

    public CriNombreVulgar(String nombreVulgar){
        this.nombreVulgar = nombreVulgar;
    }

    @Override
    public boolean cumple(Planta planta){
        if(planta.tieneNombreVulgar(nombreVulgar)){
            return true;
        }else{
            return false;
        }
    }
    
}
