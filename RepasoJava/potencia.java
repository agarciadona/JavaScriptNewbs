package org.example;

import java.util.Scanner;

public class potencia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double PI = 3.1416;
        double radio,area;

        System.out.println("cuanto mide el radio (en cm)?");
        radio = teclado.nextFloat();

        area = PI*Math.pow(radio,2);

        System.out.println("el area de la circumferencia de radio: "+radio+ " cm mide: "+area+" cm2");
    }
}
