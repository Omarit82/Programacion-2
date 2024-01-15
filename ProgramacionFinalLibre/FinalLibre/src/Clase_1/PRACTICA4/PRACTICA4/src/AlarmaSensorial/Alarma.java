package AlarmaSensorial;

import java.util.ArrayList;

public class Alarma {
    private ArrayList<Sensor> sensores;

    public Alarma(){
        sensores=new ArrayList<>();
    }

    public void agregarSensor(Sensor nuevo){
        try {
            if(nuevo != null){
                sensores.add(nuevo);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int qtySensores(){
        return sensores.size();
    }
    public void resetSensores(){
        for (Sensor sensor : sensores) {
            sensor.resetSensor();
        }
    }

    public void controlarSensores(){
        boolean check = false;
        for (Sensor sensor : sensores) {
            if(sensor.checkSensor()){
                System.out.println("El sensor "+sensor.getZona()+" está activo");
                check = true;
            }
            
        }
        if(!check){
            System.out.println("Todo ok!");
        }
    }
}
