package examenJava;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class Ordenar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String peli;

        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Train to Busan", "Red", "La jungla de cristal", "El sexto Sentido", "Fargo", "Star Wars"));

        System.out.println(lista);
        System.out.println();
        Collections.sort(lista);

        System.out.println("lista ordenada");
        System.out.println(lista);

        System.out.println("Escribe un titulo de pelicula: ");
        peli = teclado.nextLine();

        if(lista.contains(peli)){
            System.out.println("tenemos la pelicula que has pedido");
        }else{
            System.out.println("No tenemos esa pelicula");
        }


    }
}
