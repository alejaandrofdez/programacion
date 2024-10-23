package PruebaPractica2;

import java.util.Scanner;

public class Ejer3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduzca el tiempo en segundos: ");

        int tiempo = 500;
        int segundos = sc.nextInt();
        int hora = (segundos/3600);
        int minuto= (segundos/60);
    
        for(int i = tiempo; i == segundos;i--)
       
        
        System.out.println("Cuenta atras: "+hora+ minuto+ segundos);

        sc.close();
    }


}
