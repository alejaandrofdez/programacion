package DNI;

public class App {
    
    public static void main(String[] args) throws Exception{

        

        Persona p1 = new Persona( "Javi", "Ruiz", "10/09/1990", 36);

        System.out.println(p1);

        if(p1.getEdad() >= 18){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }

        p1.setNombre("Gonzalo");
        System.out.println(p1);


        Dni d1 = new Dni("12345678");
        System.out.println(d1);


        Dni d2 = new Dni("12345678", 'B');
        System.out.println(d2);

        Persona p3 = new Persona( "Jose", "Lopez", "10/09/1998", 24);
        Dni d3 = new Dni("123409678", 'Q');


        p3.setDni(d3);
        
        System.out.println(p3.getDni().getLetra());

        Persona p4 = new Persona( "Antonio", "Moyano", "10/08/2004", 20);
        Dni d4 = new Dni("26597223");

        p4.setDni(d4);

        System.out.println(p4.getDni().calcularLetra());



    }
}
