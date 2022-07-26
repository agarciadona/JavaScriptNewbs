package org.example;

public class potencias {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) numeros[i] = (int) (Math.random() * 20) + 1;

/*        for (int i = 0; i< numeros.length; i++ ){
            System.out.println("numero base:"+ numeros[i]);
            System.out.println("elevado al cuadrado: "+ Math.pow(numeros[i],2) );
            System.out.println("elevado al cubo: "+ Math.pow(numeros[i],3));

        }*/

        for (int i : numeros) {
            System.out.println("numero base:" + i);
            System.out.println("elevado al cuadrado: " + Math.pow(i, 2));
            System.out.println("elevado al cubo: " + Math.pow(i, 3));
            System.out.println("");
        }
        System.out.println("--------------------------------------");
        System.out.println("Desde la mitad");

        // de 5 a 10
        for (int i = numeros.length / 2; i < numeros.length; i++) {
            System.out.println("numero base:" + numeros[i]);
            System.out.println("elevado al cuadrado: " + Math.pow(numeros[i], 2));
            System.out.println("elevado al cubo: " + Math.pow(numeros[i], 3));
            System.out.println("");

        }

        // de 0 a 5
        for (int i = 0 / 2; i < numeros.length/2; i++) {
            System.out.println("numero base:" + numeros[i]);
            System.out.println("elevado al cuadrado: " + Math.pow(numeros[i], 2));
            System.out.println("elevado al cubo: " + Math.pow(numeros[i], 3));
            System.out.println("");

        }
    }
}