package org.example;

import java.util.Scanner;

public class metro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println();
        System.out.println("Elige version 1 o 2: 1 por numero (1,2,3,4 y 5) o 2 por nombre(L1,L2,L3,L4 y L5): ");
        int modo = teclado.nextInt();
        switch (modo) {
            //VERSION INTEGERS
            case 1:
                System.out.println("Por numeros");
                System.out.println("que linea de metro (entre la 1 y la 5)quieres consultar?");
                int opcio = teclado.nextInt();
                switch (opcio) {
                    case 1:
                        System.out.println("La L1 tiene 30 paradas");
                        break;
                    case 2:
                        System.out.println("La L2 tiene 18 paradas");
                        break;
                    case 3:
                        System.out.println("La L3 tiene 14 paradas");
                        break;
                    case 4:
                        System.out.println("La L4 tiene 16 paradas");
                        break;
                    case 5:
                        System.out.println("La L5 tiene 7 paradas");
                        break;
                }
                break;

            //VERSION STRINGS
            case 2:
                System.out.println("Por nombres");
                System.out.println("que linea de metro (entre la L1 y la L5)quieres consultar?");
                String texto = teclado.nextLine().toUpperCase();
                switch (texto) {
                    case "L1":
                        System.out.println("La L1 tiene 30 paradas");
                        break;
                    case "L2":
                        System.out.println("La L2 tiene 18 paradas");
                        break;
                    case "L3":
                        System.out.println("La L3 tiene 14 paradas");
                        break;
                    case "L4":
                        System.out.println("La L4 tiene 16 paradas");
                        break;
                    case "L5":
                        System.out.println("La L5 tiene 7 paradas");
                        break;
                }
                break;
        }


    }
}
