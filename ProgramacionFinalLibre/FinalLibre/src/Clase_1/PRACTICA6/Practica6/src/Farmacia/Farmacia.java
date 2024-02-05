package Farmacia;

public class Farmacia {
    private Stock elementos;

    public Farmacia (){
        elementos = new Stock();
    }

    /*Agregar un elemento al stock */
    public void addMed(Medicamento med){
        elementos.addMedicamento(med);
    }

    /* Consulta de labaratorio */
    public void getLab(String lab){
        elementos.getMedLaboratorio(lab);
    }

}
