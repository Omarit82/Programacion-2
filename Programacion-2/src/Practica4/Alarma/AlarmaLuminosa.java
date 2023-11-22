package Practica4.Alarma;

public class AlarmaLuminosa extends Alarma{

    private Luz luz;
    
    public AlarmaLuminosa(){
        super();
        luz = new Luz();
    }

    public void comprobar(){
        if(vidrio && apertura && movimiento){
            System.out.println("System check ok!");
        }else{
            luz.encender();
            timbre.hacerSonar();
            System.out.println("Alarma disparada! ");
        }
     }
}
