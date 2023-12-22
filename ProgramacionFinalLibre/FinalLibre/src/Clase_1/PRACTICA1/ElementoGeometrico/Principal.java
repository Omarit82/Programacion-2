package Clase_1.PRACTICA1.ElementoGeometrico;

public class Principal {
    public static void main(String[] args) {
        PuntoGeometrico pto1 = new PuntoGeometrico(-4, 3);
        PuntoGeometrico pto2 = new PuntoGeometrico(3, -4);
        System.out.println(pto1);
        System.out.println("La distancia entre los puntos es: "+pto1.distanciaEuclidea(pto2));

        // pto1.desplazarPunto(4, 0);
        // System.out.println("La distancia entre los puntos es: "+pto1.distanciaEuclidea(pto2));

        //System.out.println(pto1);

        Rectangulo rectangulo = new Rectangulo(pto1, pto2);

        System.out.println("Area del rectangulo: "+rectangulo.getArea());
        System.out.println("Es cuadrado?: "+rectangulo.esCuadrado());
        System.out.println("Apaisado? : "+rectangulo.paradoAcostado());

    }
}
