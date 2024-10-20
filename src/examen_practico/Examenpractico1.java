import java.util.Scanner;
public class Examenpractico1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    //Pedimos al usuario su edad

        System.out.println("Dime tu edad:");
        int edad = sc.nextInt();


        if (edad < 12){
            System.out.print("Niño");
        } 
        

        if (edad >= 12 && edad < 20 ) {
            System.out.print("adolescente");
        }
        

        if (edad >= 20 && edad < 45) {
            System.out.print("adulto");
        }
        

        if (edad >= 45 && edad < 70) {
            System.out.print("adulto mayor");
        }
        
        sc.close();
    }
        

}


