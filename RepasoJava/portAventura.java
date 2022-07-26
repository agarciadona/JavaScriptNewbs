package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class portAventura {

    public static void main(String[] args) {
        String[] mundos = {"A:Sesamo Aventura","B:Polynesia","C:China","D:Lejano Oeste","E:Mediterrania","F:Mexico"};
        boolean[] visitados = new boolean[6];
        Scanner teclado = new Scanner(System.in);
        String res;
        int edad;
        System.out.println(Arrays.toString(mundos));

        System.out.println("Que edad tienes?");
        edad = teclado.nextInt();

        System.out.println("Donde quieres ir ahora? para salir pulsa S");
        res = teclado.nextLine().toLowerCase();
       switch(res){
           case "a":
               if(visitados[0]){
                   System.out.println("Ya has estado aquí");
                   break;
               }else if (edad < 12){
                   System.out.println("Bienvenid@ a Sesamo Aventura");
               }else{
                   System.out.println("debes ser menor de 12 años para entrar");
               }
               visitados[0] = true;
               break;
           case "b":
               if(visitados[1]){
                   System.out.println("Ya has estado aquí");
                   break;
               }
                   System.out.println("Bienvenid@ a la Polynesia");
                   visitados[1] = true;
                   break;
           case "c":
               if(visitados[2]){
                   System.out.println("Ya has estado aquí");
                   break;
               }
               System.out.println("Bienvenid@ a China");
               visitados[2] = true;
               break;
           case "d":
               if(visitados[3]){
                   System.out.println("Ya has estado aquí");
                   break;
               }
               if (edad > 11){
                   System.out.println("Bienvenid@ al Lejano Oeste");
               }else{
                   System.out.println("debes ser mayor de 11 años para entrar");
               }visitados[3] = true;
               break;
           case "e":
               if(visitados[4]){
                   System.out.println("Ya has estado aquí");
                   break;
               }
               System.out.println("Bienvenid@ a Mediterrania");
               visitados[4] = true;
               break;
           case "f":
               if(visitados[5]){
                   System.out.println("Ya has estado aquí");
                   break;
               }
               System.out.println("Bienvenid@ a Mexico");
               visitados[5] = true;
               break;
           case "s":
               System.exit(0);
               break;
           default:
               throw new IllegalStateException("Unexpected value: " + res);
       }



        }

}
