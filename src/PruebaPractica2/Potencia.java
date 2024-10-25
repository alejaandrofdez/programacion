package PruebaPractica2;

import java.util.Scanner;


public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la base y el exponente
        System.out.print("Introduce la base (número real): ");
        int base = scanner.nextInt();
        
        System.out.print("Introduce el exponente (número entero positivo): ");
        int exponente = scanner.nextInt();
        
        // Verificar que el exponente es positivo
        if (exponente < 0) {
            System.out.println("El exponente debe ser un número entero positivo.");
        } else {
            int resultado = 1;
            
            // Calcular la potencia sin el operador de potencia
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            
            System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);
        }
        
        scanner.close();
    }
}
