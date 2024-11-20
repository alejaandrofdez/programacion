package rArrays;

import java.util.Scanner;

public class ArrayEjer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10]; // aqui se guardan los diez numeros

        int sumaPares = 0; //para ir sumando los numeros pares
        int cuentaPares = 0; // cuente los numeros pares

        for(int i = 0; i <numeros.length; i++){
            System.out.println("Introduce un numero" + i+ ": ");
        }

        for(int i = 0; i<numeros.length; i+=2){
            sumaPares += numeros[i];
            cuentaPares++;
        }
        
        double media = (double) sumaPares / cuentaPares; // To' guapo, hacemos la división.
        System.out.println("La media de los números en las posiciones pares es: " + media);
    }

}
