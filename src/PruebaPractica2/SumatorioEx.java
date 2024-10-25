package PruebaPractica2;

import java.util.Scanner;

public class SumatorioEx {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");

        int numero = sc.nextInt();

        int sumatorio = 0;

        for(int i = 0; i <= numero; i++){

            sumatorio += i;
        }
            
        //Mostrar el resultado

        System.out.println("El sumatorio de " + numero+ " es: "+ sumatorio);

        sc.close();

    }
}
