package Practica4.Seleccion;

public class Futbolista extends Integrante {
    private String posicion;
    private String piernaHabil;
    private int golesConvertidos;

    public Futbolista(String nombre,String apellido,long pasaporte,int year,int month,int day,String posicion,String piernaHabil){
        super(nombre,apellido,pasaporte,year,month,day);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
        golesConvertidos=0;
    }
    
    public void addGol(){
        golesConvertidos++;
    }

    public int getGolesConvertidos(){
        return golesConvertidos;
    }
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    public String getPiernaHabil() {
        return piernaHabil;
    }


    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }
    
    
}
