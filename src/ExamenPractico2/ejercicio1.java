package ExamenPractico2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera cuota a pagar: ");

        System.out.println("Introduce los meses de financiación: ");
        
        int pago = sc.nextInt();
        int financiacion = sc.nextInt(); 


        
        for(int i = 0; i <= financiacion; i++){

            pago = (pago*2); 
            
        }

        
        System.out.println("El precio total pagado es: " + pago );

        sc.close();
    }
}

