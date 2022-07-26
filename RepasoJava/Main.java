package ejercicios;

import java.util.Scanner;

public class Main {


    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        int opcion1, opcion2;
        superheroe[] heroes  = new superheroe[5];
        heroes[0] = new superheroe("Capt. America","USA","es un superhumano",(int) (Math.random()*100)+1);
        heroes[1] = new superheroe("Thor","Asgard","es el Dios del trueno",(int) (Math.random()*100)+1) ;
        heroes[2] = new superheroe("Iron man","USA","tiene un Supertraje",(int) (Math.random()*100)+1);
        heroes[3] = new superheroe("Spider-Man","USA","posee Habilidades aracnidas",(int) (Math.random()*100)+1);
        heroes[4] = new superheroe("Dr. Strange","USA","conoce las artes misticas",(int) (Math.random()*100)+1);

        System.out.println("Que heroes quieres ver luchar?(1 - Capt. America, 2 - Thor, 3 - Iron man, 4 - Spider-Man y 5 - Dr. Strange)");
        opcion1 = teclado.nextInt()-1;
        System.out.println("Has elegido a "+heroes[opcion1].getNombre()+" a quien quieres que se enfrente?");
        opcion2 = teclado.nextInt()-1;
        System.out.println("van a luchar "+heroes[opcion1].getNombre()+" y "+heroes[opcion2].getNombre()+" ");


        if (heroes[opcion1].getPuntos() > heroes[opcion2].getPuntos()){

            System.out.println(heroes[opcion1].getNombre()+" es de "+heroes[opcion1].getPais()+" y "+heroes[opcion1].getPoderes()+". GANA a "+heroes[opcion2].getNombre()+" por una diferencia de "+(heroes[opcion1].getPuntos()-heroes[opcion2].getPuntos())+" puntos.");
        } else if (heroes[opcion1].getPuntos() < heroes[opcion2].getPuntos()) {
            System.out.println(heroes[opcion2].getNombre()+" es de "+heroes[opcion2].getPais()+" y "+heroes[opcion2].getPoderes()+". GANA a "+heroes[opcion1].getNombre()+" por una diferencia de "+(heroes[opcion2].getPuntos()-heroes[opcion1].getPuntos())+" puntos.");

        }else {
            System.out.println("ha habido un empate entre "+heroes[opcion1].getNombre()+" y "+heroes[opcion2].getNombre()+" ");
        }

    }

}

//instancias


        /*Scanner teclado = new Scanner(System.in);

        Perro dog = new Perro("Pipo",9.5,30,"beagle");
        Perro dog2 =  new Perro("Inu",13,40, "shiba");

        System.out.println("cuanto ha recorrido el perro?");
        double recorrido = teclado.nextDouble();

        System.out.println(dog.descripcion());
        System.out.println();
        System.out.println(dog2.descripcion(recorrido));*/
/*         Ordenadores pc = new Ordenadores(700,2000, 16,"Nvidia", "Windows 10");
        Ordenadores pc2 = new Ordenadores(400,500,8,"AMD","linux") ;
        Ordenadores pcOferta = new Ordenadores(500,2000, 12,"Nvidia", "Windows 10",true);
        Ordenadores pcOferta2 = new Ordenadores(300,500, 4,"AMD", "Windows 10",false);

        System.out.println(pcOferta.getGrafica());
        pcOferta.setGrafica("TITAN X");
        pcOferta.setPrecio(1500);

        System.out.println(pcOferta.toString());
        System.out.println(pcOferta2.toString());*/