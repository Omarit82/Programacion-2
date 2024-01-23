package CentroComputos;

public class Proceso extends ElementoCola{
    private int id;
    private static int contador = 1;
    private double memoria;

    public Proceso(double memoria){
        this.memoria = memoria;
        id = contador;
        contador++;
    }

    public int getId() {
        return id;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    @Override
    public boolean comparar(ElementoCola item) {
        try {
            Proceso cc = (Proceso) item;
            if(cc.getMemoria()<this.getMemoria()){
                return true;
            }else{
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean esMayor(ElementoCola ee) {
        Proceso pp = (Proceso) ee;
        return (this.getMemoria()>pp.getMemoria());
    }

    
}
