package PruebaPractica2;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int numero = sc.nextInt();
        int num = (numero* numero*numero);

        for(int i = num; i<=8; i++){
            if (num<8) {
                num++;
            }
        }

        System.out.println("El resultado es: "+ num);

        
        sc.close();
    }
}
