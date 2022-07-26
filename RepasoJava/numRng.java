package org.example;

import java.util.Scanner;

public class numRng {


    public static void main(String[] args) {

        int cont = 0;
        int num = (int) (Math.random()*10+1);
        String  res;
        int resNum;
        boolean salir = false;
        boolean acierta = true;
        Scanner teclado = new Scanner(System.in);

        System.out.println("He pensado un numero entre el 1 y el 10, tienes que adivinarlo.");
        System.out.println("---------------------------------------------------------------");

        while (salir != true){
            cont++;
            System.out.println("Intento numero "+cont+": ");
            System.out.println("-----------------");
            res = teclado.nextLine().toLowerCase();
            if (res.equals("s")){
                salir = true;
                acierta =  false;
            }else {
                resNum =  Integer.parseInt(res);
                if (resNum == num) {
                    salir = true;
                } else {
                    System.out.println("no es correcto prueba otra vez");
                }
                if (cont == 9) {
                    salir = true;
                    acierta = false;
                }
            }
        }

        if(acierta) {
            System.out.println("Enhorabuena era el " + num + " lo has acertado en " + cont + " intentos");
        }else{
            System.out.println("lo siento, has perdido el numero era: "+num);
        }


    }
}