package org.example;

import java.util.Scanner;

public class programador {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Tienes el titulo de programador? responde (s o n)");
        String resp = teclado.nextLine().toLowerCase();

        if (resp.equals("s")){
            System.out.println("Felicidades, el puesto es tuyo.");
        }

        if (resp.equals("n")){
            System.out.println("Ahi, tienes la puerta!");
        }
        else {
            System.out.println("Respuesta invalida");
        }
    }
}
