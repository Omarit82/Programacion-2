package Pila;

public class Principal {
    public static void main(String[] args) {
        ObjetoTest o1 = new ObjetoTest("A");
        ObjetoTest o2 = new ObjetoTest("B");
        ObjetoTest o3 = new ObjetoTest("C");
        ObjetoTest o4 = new ObjetoTest("D");

        Pila pila = new Pila();
        pila.push(o1);
        pila.push(o2);
        pila.push(o3);
        pila.push(o4);
        pila.listarObjetos();
        Pila pila2 = new Pila();
        pila2 = pila.copy();
        System.out.println("______________");
        pila2.listarObjetos();
        System.out.println("Objeto: "+pila.pop());
        pila.listarObjetos();
        System.out.println("Consulta top: "+pila.top());
        pila.listarObjetos();
    }
}
