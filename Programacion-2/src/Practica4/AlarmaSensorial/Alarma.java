package Practica4.AlarmaSensorial;
import java.util.ArrayList;
/**
* Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
  alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
  se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
  la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
  sonora.
  Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
  encienda una luz cuando alguno de los indicadores está activado.
  Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
  método encender().
*/

public class Alarma {
   protected ArrayList<Sensor>sensores;
   protected Timbre timbre;
   
   public Alarma(){
      sensores = new ArrayList<Sensor>();
      timbre = new Timbre();
   }

   public void comprobar(){
      if(sensores.size()>0){
         int i=0;
         while (i< sensores.size()){
            if(sensores.get(i).isEstado()){
               timbre.hacerSonar();
               System.out.println("Alarma disparada en zona: "+sensores.get(i).getNombreZona());
            }
            i++;
         }
      }else{
         System.out.println("La alarma no contiene sensores vinculados.");
      }
   }

   public void addSensor (Sensor s){
      sensores.add(s);
   }
   
}
