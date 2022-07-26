package ejercicios;

import java.util.Scanner;

public class concesionario {

    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);


        coche coche1 = new coche("seat","Ibiza",120,"Blanco");
        coche coche2 = new coche();

        moto moto1 = new moto("HONDA","CB 500F",48, "gris");
        moto moto2 = new moto();

        System.out.println("Atributos coche:");

        System.out.println("Marca:");
       String marca2 = teclado.nextLine();
        coche2.setMarca(marca2);

        System.out.println("Modelo:");
       String modelo2 = teclado.nextLine();
        coche2.setModelo(modelo2);

        System.out.println("Potencia");
        int pot2 = teclado.nextInt();
        coche2.setPotencia(pot2);
        
        teclado.nextLine();

        System.out.println("Color");
       String color2 = teclado.nextLine();
        coche2.setColor(color2);

        System.out.println("Atributos moto");

        System.out.println("Marca:");
        marca2 = teclado.nextLine();
        moto2.setMarca(marca2);

        System.out.println("Modelo:");
        modelo2 = teclado.nextLine();
        moto2.setModelo(modelo2);

        System.out.println("Potencia");
        pot2 = teclado.nextInt();
        moto2.setPotencia(pot2);

        teclado.nextLine();

        System.out.println("Color");
        color2 = teclado.nextLine();
        moto2.setColor(color2);

        System.out.println(coche1.toString());
        System.out.println("");
        System.out.println(moto1.toString());
        System.out.println("");
        System.out.println(coche2.toString());
        System.out.println("");
        System.out.println(moto2.toString());
        System.out.println("");

    }
}
