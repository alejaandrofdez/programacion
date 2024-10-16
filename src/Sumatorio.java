import java.util.Scanner;

public class Sumatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.println("Introduce un número entero para calcular su sumatorio:");
        int numero = sc.nextInt();

        // Variable para almacenar el sumatorio
        int sumatorio = 0;

        // Calcular el sumatorio
        for (int i = 1; i <= numero; i++) {
            sumatorio += i;
        }

        // Mostrar el resultado
        System.out.println("El sumatorio de " + numero + " es: " + sumatorio);
    }
}
