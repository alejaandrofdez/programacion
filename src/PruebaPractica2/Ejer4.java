package PruebaPractica2;

import java.util.Scanner;

    public class Ejer4 {
    
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            // Solicitar la cantidad de números a introducir
            System.out.println("Ingresa la cantidad de números que deseas introducir:");
            int cantidadNumeros = input.nextInt();
            
            int mayoresCero = 0;
            int menoresCero = 0;
            int igualesCero = 0;
    
            // Solicitar los números uno por uno y contar según su valor
            for (int i = 0; i < cantidadNumeros; i++) {
                System.out.println("Ingresa el número " + (i + 1) + ":");
                int numero = input.nextInt();
                
                if (numero > 0) {
                    mayoresCero++;
                } else if (numero < 0) {
                    menoresCero++;
                } else {
                    igualesCero++;
                }
            }
    
            // Mostrar los resultados
            System.out.println("Números mayores que 0: " + mayoresCero);
            System.out.println("Números menores que 0: " + menoresCero);
            System.out.println("Números iguales a 0: " + igualesCero);
    
            input.close();
        }
    }
    

