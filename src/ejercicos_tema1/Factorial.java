package ejercicos_tema1;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Solicitar un numero al usuario
        System.out.print("Introduzca un numero: ");
        int numero= sc.nextInt();

        //Variable para almacenar el factorial
        long factorial= 1;

        //Calcular el factorial

        for(int i=1;i<=numero;i++){
            factorial *= i;
        }

        //Mostrar el resultado
        System.out.println("El facotial de"+ numero+ "es:" + factorial);
        sc.close();
    }
    
}

