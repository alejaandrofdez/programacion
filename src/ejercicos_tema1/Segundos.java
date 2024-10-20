import java.util.Scanner;
public class Segundos {

    public static final int segundos_por_minuto=60;
    public static final int segundos_por_hora=3600;
    public static final int segundos_por_dia=86400;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Pedir dias, horas, minutos y segundos
        System.out.print("Introduce la cantidad de dias: ");
        int dias= sc.nextInt();

        System.out.print("Introduce la cantidad de horas: ");
        int horas=sc.nextInt();

        System.out.print("Introduce la cantidad de minutos: ");
        int minutos= sc.nextInt();

        System.out.print("Introduce la cantidad de segundos: ");
        int segundos= sc.nextInt();

        //Calcular el total de segundos
        int totalsegundos=( dias*segundos_por_dia)+(horas*segundos_por_hora)+(minutos*segundos_por_minuto)+ segundos;
        //Mostrar resultado
        System.out.println("Total segundos:" + totalsegundos);
        sc.close();
    }
}
