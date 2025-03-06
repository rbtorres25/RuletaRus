package org.example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RuletaRusa ruleta = new RuletaRusa();
        List<String> jugadores = new ArrayList<>();

        System.out.println("Inicio juego Ruleta 6 Posiciones");



        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese el nombre del Jugador " + i + ": ");
            jugadores.add(scanner.nextLine());
        }

        boolean juegoActivo = true;
        int turno = 0;


        while (juegoActivo) {
            String jugadorActual = jugadores.get(turno);

            System.out.println("1. Disparar (" + jugadorActual + ")");
            System.out.println("2. Volver a juego");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (ruleta.disparar(jugadorActual)) {
                        juegoActivo = false;

                    } else {
                        turno = (turno + 1) % jugadores.size();

                    }
                    break;
                case 2:
                       ruleta.reiniciarJuego();
                       turno = 0;
                break;


                case 3:
                    juegoActivo = false;
                        System.out.println("\n gracias por jugar");
                    break;
                default:
                    System.out.println("Opcion no válida");


            }

        }

        scanner.close();
    }

}