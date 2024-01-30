package Puerto;

public class Principal {
    public static void main(String[] args) {
        Puerto quequen = new Puerto();

        Barco barco1 = new Barco("LZQQQ", 250000);
        Barco barco2 = new Barco("LQPDA", 125000);
        Barco barco3 = new Barco("LPQWE", 375000);
        Barco barco4 = new Barco("LVFKZ", 175000);

        quequen.agregarBarco(barco1);
        quequen.agregarBarco(barco2);
        quequen.agregarBarco(barco3);
        quequen.agregarBarco(barco4);

        Camion cam1 = new Camion("AA125HN",25000, 9);
        Camion cam2 = new Camion("AA250PO",15200, 23);
        Camion cam3 = new Camion("AA768JK", 14275, 12);

        quequen.agregarCamion(cam1);
        quequen.agregarCamion(cam2);
        quequen.agregarCamion(cam3);
        System.out.println(quequen.listarBarcos());
        System.out.println(quequen.listarCamiones());
    }
}
