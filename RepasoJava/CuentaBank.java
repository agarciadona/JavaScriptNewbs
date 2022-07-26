package ejercicios;

import java.util.Scanner;

public class CuentaBank {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;
        cliente c1 = new cliente();

        while (true) {
            opcion = teclado.nextLine();

            switch (opcion) {

                case "crear cliente":

                    break;

                case "Mostrar cliente":

                    break;

                case "Eliminar cliente":

                    break;

                case "Ingresar dinero":

                    break;
                case "Retirar dinero":

                    break;
                case "Mostrar Saldo":

                    break;
                case "Salir":
                    System.exit(0);
                    break;
            }
        }
    }
}
