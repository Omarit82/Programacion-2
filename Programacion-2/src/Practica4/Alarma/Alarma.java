package Practica4.Alarma;

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
   protected boolean vidrio;
   protected boolean apertura;
   protected boolean movimiento;
   protected Timbre timbre;
   
   public Alarma(){
      vidrio = true;
      apertura = true;
      movimiento = true;
      timbre = new Timbre(100);
   }

   public void comprobar(){
      if(vidrio && apertura && movimiento){
         System.out.println("System check ok!");
      }else{
         timbre.hacerSonar();
         System.out.println("Alarma disparada! ");
      }
   }

   public boolean isVidrio() {
      return vidrio;
   }

   public void setVidrio(boolean vidrio) {
      this.vidrio = vidrio;
   }

   public boolean isApertura() {
      return apertura;
   }

   public void setApertura(boolean apertura) {
      this.apertura = apertura;
   }

   public boolean isMovimiento() {
      return movimiento;
   }

   public void setMovimiento(boolean movimiento) {
      this.movimiento = movimiento;
   }

   
}
