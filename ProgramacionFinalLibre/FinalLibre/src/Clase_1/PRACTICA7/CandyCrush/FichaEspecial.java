package CandyCrush;

public class FichaEspecial extends Ficha {

    public FichaEspecial(int cantidadCasilleros,int fortaleza, int poderDestruccion, String nombre){
        super(cantidadCasilleros, fortaleza, poderDestruccion, nombre);
    }

    @Override
    public int getPoderDestruccion(){
        return super.getFortaleza()/super.getCantidadCasilleros();
    }
    
}
