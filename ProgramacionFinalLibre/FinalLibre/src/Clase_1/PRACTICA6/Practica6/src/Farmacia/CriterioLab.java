package Farmacia;

public class CriterioLab extends Criterio{
    private String lab;

    public CriterioLab(String lab){
        this.lab = lab;
    }

    @Override
    public boolean cumple(Medicamento med){
       return med.getLaboratorio().equals(lab);
    }
    
}
