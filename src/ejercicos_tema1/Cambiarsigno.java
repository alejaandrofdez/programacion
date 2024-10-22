package ejercicos_tema1;
import java.util.Scanner;
public class Cambiarsigno {
    public static void main(String[] args) {
        //Crear un Scanner para leer los datos
        Scanner sc = new Scanner(System.in);

        //Pedir un número
        System.out.print("Introduce un número: ");
        double num = sc.nextDouble();

        //Cambiar el signo
        double Cambiarsigno= -num;

        //mostrar el resultado
        System.out.println("Numero con signo cambiado:" + Cambiarsigno);
        sc.close();
    }
}
