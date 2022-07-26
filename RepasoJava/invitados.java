package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class invitados {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Pedro","Juan","Jose","Marta","Alex","luis","Maria","Paco","Monica","Felix"));
        System.out.println("Lista de Invitados: ");
        System.out.println(lista);

        lista.remove("Marta");
        lista.remove("Alex");

        System.out.println("Lista de Invitados Actualizada: ");
        System.out.println(lista);

        lista.add("Edu");
        lista.add("Monica");

        System.out.println("Lista de Invitados Actualizada: ");
        System.out.println(lista);

        lista.add(lista.indexOf("Monica"),"Juani");

        System.out.println("Lista de Invitados Final: ");
        System.out.println(lista);

    }


}
