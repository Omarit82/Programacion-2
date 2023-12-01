package Composite.Practica.Prefinal82023;

public class Principal {
    public static void main(String[] args) {
        Juguete uno = new Juguete("He-Man", "Mattel", 1987, 45000, 50);
        Juguete dos = new Juguete("Leon-O", "Cartan", 1992, 35000, 70);
        Juguete tres = new Juguete("Vaquero", "Mattel", 1988, 45000, 70);
        Juguete cuatro = new Juguete("Acerino", "Mattel", 2000, 35000, 70);

        Coleccion halcones = new Coleccion("Halcones Galacticos");

        halcones.add(tres);
        halcones.add(cuatro);

        Coleccion munecos =new Coleccion("Muñecos");

        munecos.add(halcones);
        munecos.add(uno);
        munecos.add(dos);
       // System.out.println(munecos.elementosTotales());
       // System.out.println(munecos.anio());
        System.out.println(uno.valorEstimado());
        System.out.println(halcones.valorEstimado());
        System.out.println(munecos.valorEstimado());
        System.out.println(halcones.contieneElemento(uno));
    }
}
