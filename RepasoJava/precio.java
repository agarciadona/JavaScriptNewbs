package org.example;

import java.util.Scanner;

public class precio {

    public static void main(String[] args) {
      float precio,iva,preciof;
        Scanner teclado = new Scanner(System.in);

        System.out.println("cuanto vale el producto?");
        precio = teclado.nextFloat();
        //iva = precio *0.21f;
        System.out.println("y el IVA cuanto vale?");
        iva = (teclado.nextFloat()/100)*precio;
        preciof = precio + iva;

        System.out.println("precio inicial: "+precio);
        System.out.println("iva: "+iva);
        System.out.println("precio total: "+preciof);
    }
}

