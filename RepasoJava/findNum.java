package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class findNum {

    public static void main(String[] args) {
       int [] numeros  = new int[5];
       boolean find = false;
       Scanner teclado = new Scanner(System.in);
       int res;
       for (int i = 0; i < numeros.length;i++) numeros[i] = (int) (Math.random()*9+1);

        System.out.println("Hay 5 numero entre el 1 y el 9, escribe un numero para saber si esta");
        System.out.println("--------------------------------------------------------------------");
        res = teclado.nextInt();

        for (int i = 0; i < numeros.length;i++){
            if (numeros[i] ==  res){
                System.out.println("el numero "+res+" y esta en la posicion "+i+" del array");
                find = true;
            }else if( i == numeros.length-1 && find == false ){
                System.out.println("el numero "+res+" no existe en la array");
            }
        }

        System.out.println(Arrays.toString(numeros));

    }
}
