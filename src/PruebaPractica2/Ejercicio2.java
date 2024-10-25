package PruebaPractica2;

import java.util.Scanner;
    public class Ejercicio2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Leer el número límite
            System.out.print("Introduce un número entero positivo: ");
            int limite = scanner.nextInt();
            
            // Verificar que el número es positivo
            if (limite < 1) {
                System.out.println("El número debe ser un entero positivo.");
            } else {
                int contador = 0;
                int suma = 0;
    
                System.out.println("Múltiplos de 3 entre 1 y " + limite + ":");
                
                // Encontrar múltiplos de 3 y calcular la suma y el conteo
                for (int i = 3; i <= limite; i += 3) {
                    System.out.println(i);
                    contador++;
                    suma += i;
                }
    
                // Mostrar resultados
                System.out.println("Cantidad de múltiplos de 3: " + contador);
                System.out.println("Suma de los múltiplos de 3: " + suma);
            }
            
            scanner.close();
        }
    }
    
