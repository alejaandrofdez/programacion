package rArrays;

import java.util.Scanner;

public class Monedas {
    

    // Constantes para las conversiones, como si fueran los códigos secretos del barrio.
    private static final double EURO_A_DOLAR = 0.98;
    private static final double EURO_A_LIBRA = 0.87;
    private static final double EURO_A_YEN = 144.73;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion; // Aquí vamos a guardar lo que el usuario elija del menú.
        double euros; // Pa' guardar los eurillos que mete el usuario.

        do {
            // Mostramos el menú, como el cartel de un garito.
            System.out.println("\n--- Menú de Conversión ---");
            System.out.println("1 - Convertir euros a dólares");
            System.out.println("2 - Convertir euros a libras");
            System.out.println("3 - Convertir euros a yenes");
            System.out.println("4 - Convertir euros a todas las monedas");
            System.out.println("0 - Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("¡Hasta luego, figura!"); // Si elige 0, se sale del garito.
                break;
            }

            if (opcion < 0 || opcion > 4) {
                System.out.println("Opción incorrecta, tronco."); // Opción que no existe.
                continue; // Pa' que vuelva a empezar el menú.
            }

            System.out.print("Introduce la cantidad de euros: ");
            euros = scanner.nextDouble();

            // Llamamos a la función pa' que haga la magia.
            double[] conversiones = convertirEurosAMonedas(euros);

            // Mostramos solo lo que toca según la opción elegida.
            switch (opcion) {
                case 1:
                    System.out.printf("%.2f euros son %.2f dólares\n", euros, conversiones[0]);
                    break;
                case 2:
                    System.out.printf("%.2f euros son %.2f libras\n", euros, conversiones[1]);
                    break;
                case 3:
                    System.out.printf("%.2f euros son %.2f yenes\n", euros, conversiones[2]);
                    break;
                case 4:
                    System.out.printf("%.2f euros son %.2f dólares, %.2f libras y %.2f yenes\n",
                            euros, conversiones[0], conversiones[1], conversiones[2]);
                    break;
            }

        } while (opcion != 0); // Sigue en el menú hasta que elijas salir.
    }

    // Función que convierte euros a todas las monedas.
    public static double[] convertirEurosAMonedas(double euros) {
        double[] conversiones = new double[3]; // Array pa' guardar los resultados.
        conversiones[0] = euros * EURO_A_DOLAR; // Euros a dólares.
        conversiones[1] = euros * EURO_A_LIBRA; // Euros a libras.
        conversiones[2] = euros * EURO_A_YEN;   // Euros a yenes.
        return conversiones; // Se devuelve el array con to' el chiringuito.
    }
}


