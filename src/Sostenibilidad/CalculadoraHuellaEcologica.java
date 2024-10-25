package Sostenibilidad;

import java.util.Scanner;

public class CalculadoraHuellaEcologica {
    public static void main(String[] args) throws Exception {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("¿Cuántas veces a la semana comes carne?");
    System.out.println("¿Cuántas veces a la semana usas transporte privado (como coche o moto)?");
    System.out.println("¿Cuántas veces a la semana usas transporte público?");
    System.out.println("¿Cuántos productos reciclables (plástico, papel, vidrio) sueles reciclar cada semana?");
    System.out.println("¿Dejas las luces encendidas al salir de una habitación? (1=Sí/ 0=No)");
    System.out.println("¿Cuántos litros de agua crees que usas al día? (ej.: 50, 100, 150)");

    int carne = sc.nextInt();
    int tprivado = sc.nextInt();
    int tpúblico= sc.nextInt();
    int reciclaje = sc.nextInt();
    int lencendidas = sc.nextInt();
    int cagua = sc.nextInt();

    int puntuación = 0;
    puntuación += carne*5;
    puntuación += tprivado *2;
    puntuación += tpúblico *1;
    puntuación -= reciclaje *2;
    puntuación += lencendidas *10;
    puntuación += cagua /10;

    System.out.println("Puntuacion total huella ecologica: " + puntuación );
    int estrellas = (int) Math.ceil(puntuación /10);

    System.out.println("Numero de estrellas: " + estrellas);
    
    if(puntuación< 30){
        System.out.println("¡Excelente! Estás contribuyendo al medio ambiente");
    } 
    if(puntuación >= 30 && puntuación <=60){
        System.out.println("Bien, pero hay margen para mejorar.");
    }
    if (puntuación > 60) {
        System.out.println("Tu huella es alta, intenta mejorar algunos hábitos");
    }

    sc.close();
    }
    
}
