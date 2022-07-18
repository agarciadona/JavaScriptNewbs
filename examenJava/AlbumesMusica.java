package examenJava;

import java.util.*;

public class AlbumesMusica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String musica;

        Album album1 = new Album("The Dark Side of the Moon","Pink Floyd",1973,"Capitol records",24);
        Album album2 = new Album("Nevermind","Nirvana",1991,"DGC Records",13);
        Album album3 = new Album("Thriller","Micheal Jackson",1982,"Epic Record",5);
        Album album4 = new Album("Is this it","The Strokes",2001,"RCA records",30);
        Album album5 = new Album("Pet Sounds","the beach boys",1966,"Capitol records",21);
        Album album6 = new Album("Ramones","Ramones",1976,"Sire Records",16);

        ArrayList<Album> lista = new ArrayList<>();
        lista.add(album1);
        lista.add(album2);
        lista.add(album3);
        lista.add(album4);
        lista.add(album5);
        lista.add(album6);


        System.out.println("Que album buscas?");
        musica = teclado.nextLine();

        for(int i = 0; i < lista.size();i++) {
            if (musica.equals(lista.get(i).getTitulo())) {
                System.out.println(lista.get(i).toString());
            }
        }

    }
}
