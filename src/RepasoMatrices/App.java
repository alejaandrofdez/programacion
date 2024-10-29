package RepasoMatrices;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception{
        
        /*Escribe un programa que pida 20 numeros enteros. Estos numeros se deben introducir en un array
         * de 4 filas por 5 columnas. 
         * El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de 
         * calculo se tratara.
        */

        

        int matriz [][] = new int[4][5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 20 numeros: ");

        System.out.println(matriz.length);

        int contFilas= 0;
        //sumar fila matriz
        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[i].length; j++){

                contFilas  = contFilas + matriz[i][j];
                
            }
            System.out.println("La suma de la fila " + i + " es " + contFilas);

        }

        int contColum= 0;
        //Sumar columnas
        for(int j = 0; j < matriz.length; j++){

            for(int i = 0; i < matriz[j].length; i++){

                contColum += matriz[j][i];
            }

            System.out.println("La suma de la columna " + j + " es " + contColum);


        }







    }

}
