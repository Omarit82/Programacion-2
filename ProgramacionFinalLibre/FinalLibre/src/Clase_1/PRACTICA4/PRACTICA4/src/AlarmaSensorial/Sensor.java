package AlarmaSensorial;
/*2- Alarma Sensorial
Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se
cambien por sensores que poseen un comportamiento y pueden sondear diferentes partes de
la casa. Cada sensor posee el nombre de la zona que controla. Permitir que se incorporen
nuevos sensores. Modificar la alarma para que además de hacer sonar el timbre, imprima por
pantalla el nombre de la zona en conflicto (pueden ser más de una). */
public class Sensor {
    private String zona;

    public Sensor(String zona){
        this.zona = zona;
    }

    public void setZona(String zona){
        this.zona = zona;
    }

    public String getZona (){
        return zona;
    }

    
    
}
