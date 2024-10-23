package PruebaPractica2;

import java.util.Scanner;

public class Ejer4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cantidad de cuatro números:4");
        System.out.println("Introduce el número 1: ");
        System.out.println("Introduce el número 2: ");
        System.out.println("Introduce el número 3: ");
        System.out.println("Introduce el número 4: ");

         double numero1 = sc.nextInt();
        
        if (numero1 < 0) {
            System.out.println("Se han introducido: "+numero1+ "menores a 0");
        }
        if (numero1 > 0) {
            System.out.println("Se han introducido: "+numero1+ "mayores a 0");
        }
        if (numero1 == 0) {
            System.out.println("Se han introducido: " +numero1+ "iguales a 0");
        }

        
        sc.close();
    }
}
