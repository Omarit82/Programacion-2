package Cooperativa;

public class Pastura extends Cereal {

    @Override
    public boolean puedeSembrarse(Lote lote){
        if(super.puedeSembrarse(lote)&&lote.getSuperficie()>=50){
            return true;
        }else{
            return false;
        }
    }
    
}
