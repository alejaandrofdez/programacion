import java.util.Scanner;
public class Examenpracticoej3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Determinar como es un triangulo

        System.out.print("Introduce un lado del triangulo: ");
        int lado1= sc.nextInt();
        
        System.out.print("Introduce un lado del triangulo: ");
        int lado2= sc.nextInt();
        
        System.out.print("Introduce un lado del triangulo: ");
        int lado3= sc.nextInt();

        if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {

            System.out.println("Equilatero");

        } else if ((lado1 == lado2 && lado1 == lado3) || (lado2 == lado1 && lado2 == lado3) ) {
            
            System.out.println("Isosceles");

        } else if (lado1 != lado2 && lado2 != lado3) {
            
            System.out.println("Escaleno");

        } else if ((lado1 + lado2) <= lado3 || (lado2 + lado3) <= lado1 ) {
            
            System.out.println("No es un triangulo");

        }
        

    }
}
