package JuegoPersonajes;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Personaje> mano;

    public Jugador(String nombre){
        this.nombre = nombre;
        mano = new ArrayList<Personaje>();
    }

    public void addCarta(Personaje pp){
        if(pp != null){
            mano.add(pp);
        }
    }

    public void removeCarta(Personaje pp){
        if((pp != null)&&(mano.contains(pp))){
            mano.remove(pp);
        }
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public Personaje jugarCarta(){
        int cartas = mano.size();
        if (cartas != 0){
            int indexCartaToPlay =(int) ((Math.random()*cartas));
            return mano.get(indexCartaToPlay);
        }else{
            return null;
        }
    }

    public int seleccionarAtributo(){
        int random = (int)((Math.random()*6)+1);
        return random;
    }

    public int mostrarAtributo(int atributo, Personaje pp){
        switch (atributo) {
            case 1: System.out.println("Altura: ");
                    return pp.getAltura();
            case 2: System.out.println("Edad: ");
                    return pp.getEdad();
            case 3: System.out.println("Peso: ");
                    return pp.getPeso();
            case 4: System.out.println("Velocidad: ");
                    return pp.getVelocidad();
            case 5: System.out.println("Vision Nocturna: ");
                    return pp.getVisionNocturna();
            case 6: System.out.println("Fuerza: ");
                    return pp.getFuerza();
            default : return 0;
            }
    }
    
    
    public void mostrarMano(){
        System.out.println("Las cartas del jugador => "+getNombre()+" son:");
        for (Personaje carta : mano) {
            System.out.println(carta.getNombreReal()+" - "+carta.getNombreSuper());
        }
    }
}
