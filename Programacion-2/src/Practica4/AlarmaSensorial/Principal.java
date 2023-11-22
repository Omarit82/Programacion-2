package Practica4.AlarmaSensorial;

public class Principal {
    public static void main(String[] args) {
        Alarma casa = new AlarmaLuminosa();
        Sensor sensor1 = new Sensor("ventana");
        Sensor sensor2 = new Sensor("puerta");
        Sensor sensor3 = new Sensor("vidrio");
        casa.addSensor(sensor3);
        casa.addSensor(sensor2);
        casa.addSensor(sensor1);
        sensor2.setEstado(true);
        casa.comprobar();
    }
}
