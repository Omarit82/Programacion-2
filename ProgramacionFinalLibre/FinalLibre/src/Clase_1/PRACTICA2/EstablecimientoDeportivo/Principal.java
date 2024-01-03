package Clase_1.PRACTICA2.EstablecimientoDeportivo;

public class Principal {
    public static void main(String[] args) {
        /* Creo un establecimiento */

        Establecimiento canchasCarlitos = new Establecimiento();

        Cancha morumbi = new Cancha("Morumbi", 400,4);
        Cancha bombonera = new Cancha("Bombonera", 400,4);
        Cancha paddle1 = new Cancha("Paddle 1", 100,6);
        Cancha paddle2 = new Cancha("Paddle 2", 100,6);
        Cancha paddle3 = new Cancha("Paddle 3", 100,6);
        Cancha paddle4 = new Cancha("Paddle 4", 100,6);

        canchasCarlitos.addCanchaFutbol(bombonera);
        canchasCarlitos.addCanchaFutbol(morumbi);
        canchasCarlitos.addCanchaPaddle(paddle1);
        canchasCarlitos.addCanchaPaddle(paddle2);
        canchasCarlitos.addCanchaPaddle(paddle3);
        canchasCarlitos.addCanchaPaddle(paddle4);
        Usuario omar = new Usuario("Omar");

        Turno unTurno = new Turno(omar, 1, 1, 2024);
        Turno segundoTurno = new Turno(omar, 1, 1, 2024);
        Turno tercerTurno = new Turno(omar, 2, 1, 2024);
        Turno cuartoTurno = new Turno(omar, 3, 1, 2024);
        canchasCarlitos.reserva(unTurno, morumbi);
        canchasCarlitos.reserva(segundoTurno, morumbi);
        canchasCarlitos.reserva(tercerTurno, morumbi);
        canchasCarlitos.reserva(cuartoTurno,morumbi);
        Turno quintoTurno = new Turno(omar, 9, 12, 2023);
        canchasCarlitos.reserva(quintoTurno, morumbi);

    }
    
}
