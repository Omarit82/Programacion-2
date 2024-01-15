package AlarmaSensorial;

public class Principal {
    public static void main(String[] args) {
        Alarma alarma = new Alarma();
        Sensor ventana1 = new Sensor("Ventana habitacion");
        Sensor puerta1 = new Sensor("Puerta principal");
        
        alarma.agregarSensor(puerta1);
        alarma.agregarSensor(ventana1);
        
        ventana1.activarSensor();
        puerta1.activarSensor();
        System.out.println(alarma.qtySensores());
        alarma.controlarSensores();
        alarma.resetSensores();
        alarma.controlarSensores();
        puerta1.activarSensor();
        alarma.controlarSensores();
    }
}
