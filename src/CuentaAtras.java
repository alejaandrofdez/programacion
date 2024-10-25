import java.util.Scanner;

public class CuentaAtras {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        // Solicitar el tiempo en segundos
        System.out.println("Introduce el tiempo en segundos para la cuenta atrás:");
        int totalSegundos = input.nextInt();

        // Ciclo para realizar la cuenta atrás
        while (totalSegundos > 0) {
            int horas = totalSegundos / 3600;
            int minutos = (totalSegundos % 3600) / 60;
            int segundos = totalSegundos % 60;

            // Mostrar el tiempo restante en formato hh:mm:ss
            System.out.printf("Tiempo restante: "+horas + minutos +segundos);

            // Espera de 1 segundo
            Thread.sleep(1000);

            // Decrementar los segundos totales
            totalSegundos--;
        }

        System.out.println("¡Cuenta atrás terminada!");
    }
}
