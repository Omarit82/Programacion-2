package Practica6.PuertoCereales;

public class Puerto {
    private ColaEspera barcos;
    private ColaEspera camiones;

    public Puerto(){
        barcos = new ColaEspera();
        camiones = new ColaEspera();
    }

    public void addBarco(Barco b){
        barcos.agregarACola(b);
    }
    
    public void addCamion(Camion c){
        camiones.agregarACola(c);
    }

    public String toString(){
        return camiones.toString() + "\n"+barcos.toString();
    }
    
}
