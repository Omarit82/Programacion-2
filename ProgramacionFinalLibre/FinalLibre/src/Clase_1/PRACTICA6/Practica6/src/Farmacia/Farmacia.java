package Farmacia;

import java.util.ArrayList;

public class Farmacia {
    private ArrayList<Medicamento> medicamentos;

    public Farmacia (){
        medicamentos = new ArrayList<>();
    }

    /*Agregar un elemento al stock */
    public void addMed(Medicamento med){
        if(!medicamentos.contains(med)){
            medicamentos.add(med);
        }
    }

    /* Consulta de labaratorio */
    public ArrayList<Medicamento> busqueda(Criterio crit){
        ArrayList<Medicamento> aux = new ArrayList<>();
        for (Medicamento item : medicamentos) {
            if(crit.cumple(item)){
                aux.add(item);
            }
        }
        return aux;
    }

}
