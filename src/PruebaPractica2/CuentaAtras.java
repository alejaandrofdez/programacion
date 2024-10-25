package PruebaPractica2;

import java.util.Scanner;

public class CuentaAtras {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        
        // Solicitar el tiempo inicial en segundos
        System.out.println("Ingresa el tiempo en segundos para la cuenta atrás:");
        int totalSegundos = input.nextInt();
        
        // Bucle de cuenta atrás
        while (totalSegundos >= 0) {
            int horas = totalSegundos / 3600;
            int minutos = (totalSegundos % 3600) / 60;
            int segundos = totalSegundos % 60;
            
            // Mostrar horas, minutos y segundos
            System.out.println("Horas: " + horas + ", Minutos: " + minutos + ", Segundos: " + segundos);
            
            // Reducir en un segundo y esperar un segundo antes de la siguiente iteración
            totalSegundos--;
            Thread.sleep(1000);
        }
        
        System.out.println("¡Tiempo terminado!");
        input.close();
    }
}
