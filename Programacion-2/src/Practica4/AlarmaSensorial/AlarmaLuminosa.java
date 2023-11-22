package Practica4.AlarmaSensorial;

public class AlarmaLuminosa extends Alarma{

    private Luz luz;
    
    public AlarmaLuminosa(){
        super();
        luz = new Luz();
    }

    public void comprobar(){
        if(sensores.size()>0){
            int i=0;
            while (i< sensores.size()){
               if(sensores.get(i).isEstado()){
                    luz.encender();
                    timbre.hacerSonar();
                    System.out.println("Alarma disparada en zona: "+sensores.get(i).getNombreZona());
               }
               i++;
            }
         }else{
            System.out.println("La alarma no contiene sensores vinculados.");
         }
    }
}
