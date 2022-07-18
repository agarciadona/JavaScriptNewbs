package examenJava;

public class Numeros {

    public static void main(String[] args) {

        int num1,num2;
        num1 = (int) (Math.random() * 900 + 101);
        num2 = (int) (Math.random() * 900 + 101);

            if (num1 > num2){
                System.out.println(num1+" es mayor que "+num2);
            } else if (num1 < num2){
                System.out.println(num1+" es menor que "+num2);
            } else{
                System.out.println("son iguales");
            }
        }

    }

