package org.example;

import java.util.Scanner;

public class circumferencia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double PI = 3.1416;
        double radio,lon;

        System.out.println("cuanto mide el radio (en cm)?");
        radio = teclado.nextFloat();

        lon = 2*PI*radio;

        System.out.println("la circumferencia de radio: "+radio+ " cm mide: "+lon+" cm");
    }
}
