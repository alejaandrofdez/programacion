import java.util.Scanner;
public class Examenpracticoej2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Pedimos al usuario su peso y masa

        System.out.print("Dime tu peso en kg: ");
        double peso= sc.nextDouble();

        System.out.print("Dime tu altura en metros: ");
        double altura = sc.nextDouble();

        
        double IMC = (peso/altura*altura);

       if (IMC > 18.5 ) {
        System.out.println("Bajo peso");
       } 
       
       if (IMC >= 18.5 && IMC<= 24.9) {
        System.out.println("Normopeso");
       }
       
       if (IMC >= 25 && IMC<= 26.9) {
        System.out.println("Sobrepeso grado I");
       }

       if (IMC >= 27 && IMC<= 29.9) {
        System.out.println("Sobrepeso grado II");
       }

       if (IMC >= 30 && IMC<= 34.9) {
        System.out.println("Obesidad de tipo I");
       }

       if (IMC >= 35 && IMC<= 39.9) {
        System.out.println("Obesidad de tipo II");
       }
       if (IMC >= 40 && IMC<= 49.9) {
        System.out.println("Obesidad de tipo III(morbida)");
       }
       if (IMC >50) {
        System.out.println("Obesidad de tipo IV(extrema)");
       }

       }
        
       

    }
