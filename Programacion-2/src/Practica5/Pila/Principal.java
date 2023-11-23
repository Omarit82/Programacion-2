package Practica5.Pila;

public class Principal {
    public static void main(String[] args) {
        Pila arreglo = new Pila();

        String a = "Algo";
        String b = "Otra cosa";
        arreglo.push(b);
        arreglo.push(a);
        System.out.println(arreglo.size());

        System.out.println(arreglo.top());
        System.out.println(arreglo.pop());
        System.out.println(arreglo.pop());
        System.out.println(arreglo.pop());

    }
}
