package Congreso;

public class Posters extends Trabajo {

    public Posters(String titulo) {
        super(titulo);
    }

    @Override
    public boolean puedeEvaluar(Evaluador ee){
        boolean cumple = false;
        for (String palabra : tags) {
            if(ee.tieneTag(palabra)){
                cumple = true;
            }
        }
        return cumple;
    }
    
}
