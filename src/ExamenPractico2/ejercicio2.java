package ExamenPractico2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un intervalo de números: ");

        int numero = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3= sc.nextInt();
        int num4= sc.nextInt();
        int sumatorio = numero+num1+num2+num3+num4;

        if ( numero > num4){

            System.out.println("Introduce otro número diferente al principio del intervalo: ");
            System.out.println("Introduce un intervalo de números: ");

        }

       
        for(int i = numero; i != 0; i++){

            if (numero == 0 ) {
                System.out.println("Programa terminado");
            }

        }
        System.out.println("La suma de: " + numero+num1+num2+num3+num4+  " es: " + sumatorio);

        


        sc.close();

    }
}
