package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InvitadosV2 {
    public static void main(String[] args) {
        String res;
        int ind;
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Pedro","Juan","Jose","Marta","Alex","luis","Maria","Paco","Monica","Felix"));


        while (true) {
            System.out.println("Lista de Invitados: Que quieres hacer anadir o borrar?");
            System.out.println(lista);
            res = teclado.nextLine().toLowerCase();

            if (res.equals("salir")) {
                System.out.println("adios!");
                System.exit(0);
                 }

            if(res.equals("anadir")){
                System.out.println("A quien quieres anadir?");
                res = teclado.nextLine();
                System.out.println("A que posicion de la lista?");
                ind = teclado.nextInt();
                lista.add(ind,res);
            }

            if (res.equals("borrar")){
                System.out.println("A quien quieres Borrar de la lista? (posicion de la persona en la lista)");
                ind = teclado.nextInt();
                lista.remove(ind);
                System.out.println("Lista de Invitados Actualizada");
                teclado.nextLine();
            }else {
                System.out.println("Respuesta invalida");
            }
            }




        }

    }
