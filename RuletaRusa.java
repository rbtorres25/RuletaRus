package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RuletaRusa {

    private List<Integer> tambor;
    private int bala;
    private int posicionActual;
    private Random random;

    //Metodo constructor

    public RuletaRusa() {
        random = new Random();
        tambor = new ArrayList<>();
        reiniciarJuego();
    }

    public boolean disparar(String jugador) {

        System.out.println("\n Turno de " + jugador);
        System.out.println("Disparando en la posición: " + posicionActual);

        if (posicionActual == bala) {
            System.out.println( jugador + " ha perdido el juego ");
            return true;

        } else {

        System.out.println("El Jugador se salva");
        posicionActual = (posicionActual + 1) % tambor.size();
        return false;

    }

}
    public void reiniciarJuego() {
        tambor.clear();
        for (int i = 0; i < 6; i++) {
            tambor.add(i);
        }
        bala = random.nextInt(6);
        posicionActual = 0;

}

}
