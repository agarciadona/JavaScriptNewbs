package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,suma, div,mod;
        String nombre;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Escribe el nombre: ");
        nombre = teclado.nextLine();


        System.out.println("Escribe el primer numero");
        num1 = teclado.nextInt();
        System.out.println("Escribe el segundo numero");
        num2 = teclado.nextInt();

        suma =  num1 + num2;
        div = num1/num2;
        mod =  num1%num2;
        System.out.println(nombre+" la suma es: "+suma);
        System.out.println("la division es: "+div);
        System.out.printf("el modulo es: "+mod);
    }
}